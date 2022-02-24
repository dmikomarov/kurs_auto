package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  private static final Point POINT_1 = new Point(0, 0);;
  private static final Point POINT_2 = new Point(3, 4);;
  private static final int EXPECTED_DISTANCE = 5;


  @Test
  void testStatic() {
    double result = Point.distance(POINT_1, POINT_2);
    System.out.println(result);
    Assert.assertEquals(result, EXPECTED_DISTANCE);
  }

  @Test
  void testObject() {
    Assert.assertEquals(POINT_1.distance(POINT_2), EXPECTED_DISTANCE);
  }
}
