package com.chace.batch.listeners;

import com.chace.batch.entity.Utilisateur;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.item.Chunk;

@Slf4j
public class CustomItemWriteListener implements ItemWriteListener<Utilisateur> {

  @Override
  public void beforeWrite(Chunk<? extends Utilisateur> items) {
    log.info("[WRITER_LIST] Writing started persons list : {}", items);
  }

  @Override
  public void afterWrite(Chunk<? extends Utilisateur> items) {
    log.info("[WRITER_LIST] Writing completed persons list : {}", items);
  }

  @Override
  public void onWriteError(Exception e, Chunk<? extends Utilisateur> items) {
    log.error("Error in reading the person records {}", items, e);
  }
}