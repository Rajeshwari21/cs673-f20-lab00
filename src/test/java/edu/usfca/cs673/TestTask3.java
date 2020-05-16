package edu.usfca.cs673;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTask3 {
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
    assertEquals(42382, Task3.getNumberOfTeamFormations(10));
    assertEquals(2747, Task3.getNumberOfTeamFormations(11));
  }

  @Test
  public void testGetNumberOfTeamFormations04() {
    assertEquals(18060, Task3.getNumberOfTeamFormations(20));
    assertEquals(8174, Task3.getNumberOfTeamFormations(25));
    assertEquals(15796, Task3.getNumberOfTeamFormations(30));
  }
}
