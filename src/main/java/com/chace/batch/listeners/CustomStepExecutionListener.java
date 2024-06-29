package com.chace.batch.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;

@Slf4j
public class CustomStepExecutionListener extends StepExecutionListenerSupport {
  @Override
  public void beforeStep(StepExecution stepExecution) {
    log.info("[STEP_LIST] Step is about to start for Step Name: {} started at: {}", stepExecution.getStepName(), stepExecution.getStartTime());
  }

  @Override
  public ExitStatus afterStep(StepExecution stepExecution) {
    log.info("[STEP_LIST] Step has completed with status: {}", stepExecution.getStatus());
    // Customize the ExitStatus based on your logic && Add any cleanup or logic after the step completes
    return null; // Return null to use the default ExitStatus, OR ExitStatus.COMPLETED;
  }
}