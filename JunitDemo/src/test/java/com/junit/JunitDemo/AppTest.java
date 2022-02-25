package com.junit.JunitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import junit.framework.TestCase;


public class AppTest extends TestCase
{
   @BeforeClass
    public static void beforeClass() {
	   System.out.println("Run Before Class");
   }
     
   @Before
   public void before() {
	   System.out.println("Run Before");
   }
   
   @org.junit.Test
    public void test() {
	   System.out.println("Run main test case");
	   assertTrue("Result: ", App.isGreater(13,6));
   }
   
   @After
   public void after() {
	   System.out.println("Run main after test case");
   }
   
   @AfterClass
	   public static void afterClass() {
		   System.out.println("Run After Class");
    }
}
