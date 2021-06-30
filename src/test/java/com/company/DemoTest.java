package com.company;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void demoTestTrue() {
        System.out.println("Hello World True");
        Assert.assertTrue(true);
    }

    @Test
    public void demoTestFalse() {
        System.out.println("Hello World False");
        Assert.assertTrue(true);
    }
}
