package com.nektoman.logging_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Logic1
{
    private int index=0;

    private static Logger logger = LoggerFactory.getLogger(Logic1.class);

    public void doLogic() throws Exception{
        index++;
        logger.debug("doLogic");
    }

    public int getIndex() {
        return index;
    }
}
