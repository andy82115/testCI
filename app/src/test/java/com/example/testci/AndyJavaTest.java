package com.example.testci;

import org.junit.Assert;
import org.junit.Test;

public class AndyJavaTest {

    @Test
    public void mTest(){
        int a = 10;
        int b = 10;
        Assert.assertEquals(100, a*b);
    }
}
