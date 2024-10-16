public class Demo{
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2));
  }

  public static void main(String[]args){
    Point original = new Point(2.4, 4.2);
    Point copy = new Point(original);
    System.out.println(original);
    System.out.println(copy);
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
  }
}