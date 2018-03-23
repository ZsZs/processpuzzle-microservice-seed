package com.processpuzzle.seed.application;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProcessPuzzleSeedApplication {
   private static Logger logger = LoggerFactory.getLogger( ProcessPuzzleSeedApplication.class );

   public static void main( String[] args ) {
      logger.info( "About to start ProcessPuzzle-Core." );
      SpringApplication.run( ProcessPuzzleSeedApplication.class, args );
   }

   @PreDestroy
   public void shutDown() {
      logger.info( "About to stop ProcessPuzzle-Core." );
   }
}
