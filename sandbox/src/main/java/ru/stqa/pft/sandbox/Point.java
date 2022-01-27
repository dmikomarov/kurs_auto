package ru.stqa.pft.sandbox;

public class Point {
  private double x;
  private double y;

  public static double distance(Point p1, Point p2) {
    double square1 = Math.pow(p1.x-p2.x,2);
    double square2 = Math.pow(p1.y-p2.y,2);
    double result = Math.sqrt(square1 + square2);
    return result;
  }
  public double distance(Point other){
    double square1 = Math.pow(this.x-other.x,2);
    double square2 = Math.pow(this.y-other.y,2);
    double result = Math.sqrt(square1 + square2);
    return result;
  }

  public static void main(String[] args) {
    Point point1 = new Point();
    point1.x = 0;
    point1.y = 0;
    Point point2 = new Point();
    point2.x = 3;
    point2.y = 4;
    double result = Point.distance(point1,point2);
    System.out.println(result);
    assert result == 5.0;
    result = point1.distance(point2);
    assert result == 5.0;
    System.out.println(result);
  }
}
