/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstRunningAttempts;

/**
 *
 * @author johnp
 */
public class MainForRectangle {

    public static Rectangle[] createRectangles() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle();
        Rectangle[] rectangle = {r1, r2, r3, r4};
        return rectangle;
    }

    public static Point[] createPoints() {
        Point a = new Point();
        Point b = new Point();
        Point c = new Point();
        Point d = new Point();
        Point[] points = {a, b, c, d};
        return points;
    }

    public static Point[] setPoints(Point[] point) {
        point[0].setX(3);
        point[0].setY(8);
        point[1].setX(8);
        point[1].setY(8);
        point[2].setX(8);
        point[2].setY(3);
        point[3].setX(3);
        point[3].setY(3);
        return point;
    }

    public static void main(String[] args) {
        Rectangle[] rectangle = createRectangles();
        Point[] point = createPoints();
        point = setPoints(point);
        rectangle[0].setA(point[0]);
        rectangle[0].setB(point[1]);
        rectangle[0].setC(point[2]);
        rectangle[0].setD(point[3]);
        System.out.println(rectangle[0].perimeter() + " perimeter");
        System.out.println(rectangle[0].area() + " area");
    }

}
