package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTest {
  @Test
  public void testConcatenate() {
    Example1 example = new Example1();
    String result = example.concatenate("one", "two");

    System.out.println("Verify result = onetwo");
    assertEquals("onetwo", result);

  }

}
