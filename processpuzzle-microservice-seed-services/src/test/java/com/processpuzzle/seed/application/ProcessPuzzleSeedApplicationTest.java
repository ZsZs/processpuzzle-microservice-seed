package com.processpuzzle.seed.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ProcessPuzzleSeedApplication.class })
@ActiveProfiles( "unit-test" )
public class ProcessPuzzleSeedApplicationTest {
   
   @Test public void contextLoads() throws Exception {      
   }

}
