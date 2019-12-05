package com.nektoman.logging_test;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Logic1Test {

   private static Logger logger = LoggerFactory.getLogger(Logic1Test.class);

   @BeforeClass
   public static void start(){
       logger.debug("\n");
       logger.debug("Logic1Test started");
       //master branch
   }

    @org.junit.Test
    public void doLogic() throws Exception {
        Logic1 logic = new Logic1();
        logic.doLogic();
        assertTrue(logic.getIndex() == 1);
    }
}