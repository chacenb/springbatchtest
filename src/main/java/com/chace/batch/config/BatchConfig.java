package com.chace.batch.config;

import com.chace.batch.listeners.*;
import com.chace.batch.student.Student;
import com.chace.batch.student.StudentRepository;
import com.chace.batch.student.Studentnew;
import com.chace.batch.student.StudentnewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@RequiredArgsConstructor
public class BatchConfig {

  private final        JobRepository              jobRepository;
  private final        PlatformTransactionManager platformTransactionManager;
  private final        StudentRepository          repository;
  private final        StudentnewRepository       repositorynew;
  private static final String                     CVS_PATH         = "src/main/resources/csvfiles";
  private static final String                     UTILISATEURS_CSV = CVS_PATH + "/utilisateur.csv";
  private static final String                     TEST_CSV         = CVS_PATH + "/test.csv";
  private static final int                        CHUNK_SIZE       = 2;


  @Bean
  public FlatFileItemReader<Student> reader() {
    FlatFileItemReader<Student> itemReader = new FlatFileItemReader<>();
    itemReader.setResource(new FileSystemResource(TEST_CSV));
    itemReader.setName("csvReader");
    itemReader.setLinesToSkip(1);
    itemReader.setLineMapper(lineMapper());
    return itemReader;
  }

  @Bean
  public StudentProcessor processor() {
    return new StudentProcessor();
  }


  /* writes data in same format */
//  @Bean
//  public RepositoryItemWriter<Student> writer() {
//    RepositoryItemWriter<Student> writer = new RepositoryItemWriter<>();
//    writer.setRepository(repository);
//    writer.setMethodName("save");
//    return writer;
//  }


  /* writes data in different format */
  @Bean
  public RepositoryItemWriter<Studentnew> writer() {
    RepositoryItemWriter<Studentnew> writer = new RepositoryItemWriter<>();
    writer.setRepository(repositorynew);
    writer.setMethodName("save");
    return writer;
  }


  @Bean
  public Step step1() {
    return new StepBuilder("csvImport", jobRepository)
      .<Student, Studentnew>chunk(CHUNK_SIZE, platformTransactionManager)
      .listener(new CustomStepExecutionListener())
      .listener(new CustomChunkListener())
      .listener(new CustomItemReadListener<>())
      .listener(new CustomItemProcessListener())
      .listener(new CustomItemWriteListener())
      .reader(reader())
      .processor(processor())
      .writer(writer())
      .taskExecutor(taskExecutor())
      .build();
  }

  @Bean
  public Job runJob() {
    return new JobBuilder("importStudents", jobRepository)
      .listener(new CustomJobExecutionListener())
      .start(step1())
      .build();

  }

  @Bean
  public TaskExecutor taskExecutor() {
    SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
    asyncTaskExecutor.setConcurrencyLimit(10);
    return asyncTaskExecutor;
  }

  private LineMapper<Student> lineMapper() {
    DefaultLineMapper<Student> lineMapper = new DefaultLineMapper<>();

    DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
    lineTokenizer.setDelimiter(",");
    lineTokenizer.setStrict(false);
    lineTokenizer.setNames("id", "firstName", "lastName", "age");

    BeanWrapperFieldSetMapper<Student> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
    fieldSetMapper.setTargetType(Student.class);

    lineMapper.setLineTokenizer(lineTokenizer);
    lineMapper.setFieldSetMapper(fieldSetMapper);
    return lineMapper;
  }
}
