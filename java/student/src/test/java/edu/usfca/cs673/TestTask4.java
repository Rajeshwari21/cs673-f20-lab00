package edu.usfca.cs673;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTask4 {
  final static double EPSILON = 1.e-9;

  @Test
  public void testGetProbability01() {
    assertEquals(0.5, Task4.getProbability(2, 0), EPSILON);
    assertEquals(0., Task4.getProbability(3, 0), EPSILON);
    assertEquals(0.375, Task4.getProbability(4, 0), EPSILON);
    assertEquals(0.125, Task4.getProbability(4, 4), EPSILON);
    assertEquals(0.625, Task4.getProbability(5, 1), EPSILON);
  }

  @Test
  public void testGetProbability02() {
    assertEquals(0, Task4.getProbability(5, 0), EPSILON);
    assertEquals(0.625, Task4.getProbability(5, 1), EPSILON);
    assertEquals(0, Task4.getProbability(5, 2), EPSILON);
    assertEquals(0.3125, Task4.getProbability(5, 3), EPSILON);
    assertEquals(0, Task4.getProbability(5, 4), EPSILON);
    assertEquals(0.0625, Task4.getProbability(5, 5), EPSILON);
  }

  @Test
  public void testGetProbability03() {
    assertEquals(0.3125, Task4.getProbability(6, 0), EPSILON);
    assertEquals(0, Task4.getProbability(6, 1), EPSILON);
    assertEquals(0.46875, Task4.getProbability(6, 2), EPSILON);
    assertEquals(0, Task4.getProbability(6, 3), EPSILON);
    assertEquals(0.1875, Task4.getProbability(6, 4), EPSILON);
    assertEquals(0, Task4.getProbability(6, 5), EPSILON);
    assertEquals(0.03125, Task4.getProbability(6, 6), EPSILON);
  }

  @Test
  public void testGetProbability04() {
    assertEquals(0.375, Task4.getProbability(4, 0), EPSILON);
    assertEquals(0, Task4.getProbability(4, 1), EPSILON);
    assertEquals(0.5, Task4.getProbability(4, 2), EPSILON);
    assertEquals(0, Task4.getProbability(4, 3), EPSILON);
    assertEquals(0.125, Task4.getProbability(4, 4), EPSILON);
  }

  @Test
  public void testGetProbability05() {
    assertEquals(0.176197052, Task4.getProbability(20, 0), EPSILON);
    assertEquals(0, Task4.getProbability(20, 1), EPSILON);
    assertEquals(0.320358276, Task4.getProbability(20, 2), EPSILON);
    assertEquals(0, Task4.getProbability(20, 3), EPSILON);
    assertEquals(0.240268707, Task4.getProbability(20, 4), EPSILON);
    assertEquals(0, Task4.getProbability(20, 5), EPSILON);
    assertEquals(0.147857666, Task4.getProbability(20, 6), EPSILON);
    assertEquals(0, Task4.getProbability(20, 7), EPSILON);
    assertEquals(0.073928833, Task4.getProbability(20, 8), EPSILON);
    assertEquals(0, Task4.getProbability(20, 9), EPSILON);
    assertEquals(0.0295715332, Task4.getProbability(20, 10), EPSILON);
    assertEquals(0, Task4.getProbability(20, 11), EPSILON);
    assertEquals(0.00924110413, Task4.getProbability(20, 12), EPSILON);
    assertEquals(0, Task4.getProbability(20, 13), EPSILON);
    assertEquals(0.00217437744, Task4.getProbability(20, 14), EPSILON);
    assertEquals(0, Task4.getProbability(20, 15), EPSILON);
    assertEquals(0.00036239624, Task4.getProbability(20, 16), EPSILON);
    assertEquals(0, Task4.getProbability(20, 17), EPSILON);
    assertEquals(3.81469727e-5, Task4.getProbability(20, 18), EPSILON);
    assertEquals(0, Task4.getProbability(20, 19), EPSILON);
    assertEquals(1.90734863e-6, Task4.getProbability(20, 20), EPSILON);
  }
}
