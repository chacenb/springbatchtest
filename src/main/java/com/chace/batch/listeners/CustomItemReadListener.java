package com.chace.batch.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ItemReadListener;

@Slf4j
public class CustomItemReadListener<T> implements ItemReadListener<T> {

  @Override
  public void beforeRead() {
    log.info("[READER_LIST] Before reading item");
  }

  @Override
  public void afterRead(T item) {
    log.info("[READER_LIST] After reading item: {}", item.toString());
  }

  @Override
  public void onReadError(Exception ex) {
    log.info("[READER_LIST] Error during item reading: {}", ex.getMessage());
  }
}