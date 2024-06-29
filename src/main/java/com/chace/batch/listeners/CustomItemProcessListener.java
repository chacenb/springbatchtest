package com.chace.batch.listeners;

import com.chace.batch.entity.Utilisateur;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ItemProcessListener;

@Slf4j
public class CustomItemProcessListener implements ItemProcessListener<Utilisateur, Utilisateur> {

  @Override
  public void beforeProcess(Utilisateur input) {
    log.info("[PROCESS_LIST] Utilisateur record has been read: {}", input);
  }

  @Override
  public void afterProcess(Utilisateur input, Utilisateur result) {
    log.info("[PROCESS_LIST] Utilisateur record has been processed to : {}", result);
  }

  @Override
  public void onProcessError(Utilisateur input, Exception e) {
    log.error("[PROCESS_LIST] Error in reading the person record : {}", input, e);
  }
}