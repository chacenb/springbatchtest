package com.chace.batch.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomJobExecutionListener implements JobExecutionListener {

  @Override
  public void beforeJob(JobExecution jobExecution) {
    log.info("[JOB_LIST] Job is about to start for Job ID: {}", jobExecution.getJobId());
  }

  @Override
  public void afterJob(JobExecution jobExecution) {
    log.info("[JOB_LIST] Job has completed with status: {} ", jobExecution.getStatus());
  }
}

/* Another way to write this class is below */





//@Slf4j
//public class CustomJobExecutionListener {
//  @BeforeJob
//  public void beforeJob(JobExecution jobExecution) {
//    log.info("Job is about to start for Job ID: {}", jobExecution.getJobId());
//  }
//  @AfterJob
//  public void afterJob(JobExecution jobExecution) {
//    log.info("Job has completed with status: {} ", jobExecution.getStatus());
//  }
//}