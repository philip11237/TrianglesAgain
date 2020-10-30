public class Tester{
  public static void main(String []args){
    Point coord1=new Point (2,4);
    System.out.println (coord1.getX()+ " " +coord1.getY());
    Point coord2=new Point(3,4);
    Point coord3=new Point(0,0);
    System.out.println (coord2.distanceTo(coord3) );
    System.out.println (coord1.distanceTo(coord2) );
    System.out.println (coord2.equals(coord3) );
    System.out.println (coord1.equals(coord2) );
    System.out.println (coord2.equals(coord2) );
  }
}
