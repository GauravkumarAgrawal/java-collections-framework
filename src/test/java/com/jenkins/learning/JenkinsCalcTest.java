package com.jenkins.learning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JenkinsCalcTest {
    @Test
    public void addTest(){
    JenkinsCalculator jc = new JenkinsCalculator();
        Assert.assertEquals(10, jc.addtwonumbers(5,5));
        System.out.println("Inside Add ");
    }

    @Test
    public void subsTest(){
    JenkinsCalculator jc = new JenkinsCalculator();
    Assert.assertEquals(5, jc.substwonumbers(10,5));
        System.out.println("Inside Subs ");
    }
}
