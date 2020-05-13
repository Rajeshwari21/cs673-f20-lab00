package edu.usfca.cs673;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTask1 {

  @Test
  public void testGetNumberOfWaysRecursive01() {
    assertEquals(1, Task1.getNumberOfWaysRecursive(1));
    assertEquals(2, Task1.getNumberOfWaysRecursive(2));
    assertEquals(3, Task1.getNumberOfWaysRecursive(3));
    assertEquals(5, Task1.getNumberOfWaysRecursive(4));
    assertEquals(8, Task1.getNumberOfWaysRecursive(5));
  }

  @Test
  public void testGetNumberOfWaysRecursive02() {
    assertEquals(89, Task1.getNumberOfWaysRecursive(10));
    assertEquals(144, Task1.getNumberOfWaysRecursive(11));
    assertEquals(233, Task1.getNumberOfWaysRecursive(12));
    assertEquals(377, Task1.getNumberOfWaysRecursive(13));
    assertEquals(610, Task1.getNumberOfWaysRecursive(14));
  }

  @Test
  public void testGetNumberOfWaysRecursive03() {
    assertEquals(46368, Task1.getNumberOfWaysRecursive(23));
    assertEquals(75025, Task1.getNumberOfWaysRecursive(24));
    assertEquals(21402, Task1.getNumberOfWaysRecursive(25));
    assertEquals(96427, Task1.getNumberOfWaysRecursive(26));
    assertEquals(17838, Task1.getNumberOfWaysRecursive(27));
  }

  @Test
  public void testGetNumberOfWaysRecursive04() {
    assertEquals(89723, Task1.getNumberOfWaysRecursive(673));
    assertEquals(48310, Task1.getNumberOfWaysRecursive(2020));
  }

  @Test
  public void testGetNumberOfWaysIterative01() {
    assertEquals(1, Task1.getNumberOfWaysIterative(1));
    assertEquals(2, Task1.getNumberOfWaysIterative(2));
    assertEquals(3, Task1.getNumberOfWaysIterative(3));
    assertEquals(5, Task1.getNumberOfWaysIterative(4));
    assertEquals(8, Task1.getNumberOfWaysIterative(5));
  }

  @Test
  public void testGetNumberOfWaysIterative02() {
    assertEquals(89, Task1.getNumberOfWaysIterative(10));
    assertEquals(144, Task1.getNumberOfWaysIterative(11));
    assertEquals(233, Task1.getNumberOfWaysIterative(12));
    assertEquals(377, Task1.getNumberOfWaysIterative(13));
    assertEquals(610, Task1.getNumberOfWaysIterative(14));
  }

  @Test
  public void testGetNumberOfWaysIterative03() {
    assertEquals(46368, Task1.getNumberOfWaysIterative(23));
    assertEquals(75025, Task1.getNumberOfWaysIterative(24));
    assertEquals(21402, Task1.getNumberOfWaysIterative(25));
    assertEquals(96427, Task1.getNumberOfWaysIterative(26));
    assertEquals(17838, Task1.getNumberOfWaysIterative(27));
  }

  @Test
  public void testGetNumberOfWaysIterative04() {
    assertEquals(89723, Task1.getNumberOfWaysIterative(673));
    assertEquals(48310, Task1.getNumberOfWaysIterative(2020));
  }
}
