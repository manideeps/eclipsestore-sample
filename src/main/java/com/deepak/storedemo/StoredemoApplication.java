package com.deepak.storedemo;

import org.eclipse.store.integrations.spring.boot.types.EclipseStoreSpringBoot;
import org.eclipse.store.storage.types.StorageManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(EclipseStoreSpringBoot.class)
public class StoredemoApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(StoredemoApplication.class, args);
    StorageManager manager = context.getBean(StorageManager.class);
    Object root = manager.root();

    if (root instanceof Data data){
      System.out.println("Welcome---"+data.getWelcomeText());
      System.out.println("Root is data");
      data.setWelcomeText(data.getWelcomeText()+"-append--"+"welcome again");
      manager.storeRoot();
    }else {
      System.out.println("Root is not data");
    }

  }

}
