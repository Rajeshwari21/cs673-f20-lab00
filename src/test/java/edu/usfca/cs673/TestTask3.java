package edu.usfca.cs673;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask3 {
  // Note: You may find WolframAlpha (https://www.wolframalpha.com/) useful when dealing with large factorials while checking your answers.
  
  @Test
  public void testGetNumberOfTeamFormations01() {
    assertEquals(1, Task3.getNumberOfTeamFormations(1));
    assertEquals(3, Task3.getNumberOfTeamFormations(2));
    assertEquals(10, Task3.getNumberOfTeamFormations(3));
  }

  @Test
  public void testGetNumberOfTeamFormations02() {
    assertEquals(35, Task3.getNumberOfTeamFormations(4));
    assertEquals(126, Task3.getNumberOfTeamFormations(5));
    assertEquals(462, Task3.getNumberOfTeamFormations(6));
  }

  @Test
  public void testGetNumberOfTeamFormations03() {
    assertEquals(24310, Task3.getNumberOfTeamFormations(9));
    assertEquals(92378, Task3.getNumberOfTeamFormations(10));
    assertEquals(52743, Task3.getNumberOfTeamFormations(11));
  }

  @Test
  public void testGetNumberOfTeamFormations04() {
    assertEquals(68056, Task3.getNumberOfTeamFormations(20));
    assertEquals(8174, Task3.getNumberOfTeamFormations(25));
    assertEquals(15796, Task3.getNumberOfTeamFormations(30));
  }
}
