package edu.usfca.cs673;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTask2 {

  @Test
  public void testGetNumberOfInversions01() {
    assertEquals(0, Task2.getNumberOfInversions(new int[] {1, 2, 3}));
  }

  @Test
  public void testGetNumberOfInversions02() {
    assertEquals(1, Task2.getNumberOfInversions(new int[] {20, 10}));
  }

  @Test
  public void testGetNumberOfInversions03() {
    assertEquals(1, Task2.getNumberOfInversions(new int[] {20, 10, 30}));
  }

  @Test
  public void testGetNumberOfInversions04() {
    assertEquals(3, Task2.getNumberOfInversions(new int[] {30, 20, 10}));
  }

  @Test
  public void testGetNumberOfInversions05() {
    assertEquals(13, Task2.getNumberOfInversions(new int[] {2020, 686, 1, 3, 2, 0}));
  }

  @Test
  public void testGetNumberOfInversions06() {
    int[] A = new int[55], B = new int[55];
    for (int i = 0; i < 55; i++) {
      A[i] = i;
      B[i] = 55 - i;
    }
    assertEquals(0, Task2.getNumberOfInversions(A));
    assertEquals(1485, Task2.getNumberOfInversions(B));
  }
}
