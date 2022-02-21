package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
@Test
  public void testArea() {
  Point point1 = new Point(0, 0);
  Point point2 = new Point(3, 4);
  double result = Point.distance(point1, point2);
  System.out.println(result);
  Assert.assertEquals(result, 5.0);
  result = point1.distance(point2);
  Assert.assertEquals(result, 5.0);
  System.out.println(result);
  }
  @Test
  public void testArea1() {
    Point point1 = new Point(0, 0);
    Point point2 = new Point(3, 3);
    double result = Point.distance(point1, point2);
    System.out.println(result);
    Assert.assertEquals(result, 5.0);
    result = point1.distance(point2);
    Assert.assertEquals(result, 5.0);
    System.out.println(result);
  }
}
