package ru.stqa.pft.sandbox;

class Main {
  public static void main(String[] args) {
    Point point1 = new Point(0, 0);
    Point point2 = new Point(3, 4);
    double result = Point.distance(point1, point2);
    System.out.println(result);
    assert result == 5.0;
    result = point1.distance(point2);
    assert result == 5.0;
    System.out.println(result);
  }
}

public class Point {
  private final double x;
  private final double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;

  }

  public static double distance(Point p1, Point p2) {
    double square1 = Math.pow(p1.x - p2.x, 2);
    double square2 = Math.pow(p1.y - p2.y, 2);
    return Math.sqrt(square1 + square2);
  }

  public double distance(Point other) {
    double square1 = Math.pow(this.x - other.x, 2);
    double square2 = Math.pow(this.y - other.y, 2);
    return Math.sqrt(square1 + square2);
  }


}
