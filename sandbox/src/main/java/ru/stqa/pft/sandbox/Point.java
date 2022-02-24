package ru.stqa.pft.sandbox;

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
