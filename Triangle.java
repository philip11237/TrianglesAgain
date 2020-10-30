public class Triangle{
  private Point v1, v2, v3;
  public Triangle(Point a, Point b, Point c) {
    v1=  a;
    v2=  b;
    v3= c;
  }
    //Points are immutable, so you can just store the reference, no copy needed.

 public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1=new Point(x1,y1);
    v2=new Point(x2,y2);
    v3=new Point(x3,y3);

 }
 public String classify(){
    double a = Math.round(10000*v1.distanceTo(v2))/10000.0;
    double b = Math.round(10000*v2.distanceTo(v3))/10000.0;
    double c = Math.round(10000*v1.distanceTo(v3))/10000.0;
  //  System.out.println (a+" " +b+" " +c);
    if (a==c && a==b){
    return "equilateral";}
    if (a==c || a==b ||b==c){
    return "isosceles";}
    else {return  "scalene";}
 }
 public double getPerimeter(){
   double a = v1.distanceTo(v2);
   double b = v2.distanceTo(v3);
   double c = v1.distanceTo(v3);
    return  (a+b+c);
  }
  public double getArea( ){
      double a = v1.distanceTo(v2);
       double b = v2.distanceTo(v3);
       double c = v1.distanceTo(v3);
     double s=  (a+b+c)/2;
     return Math.sqrt(s*(s-a)*(s-b)*(s-c));
   }
   public String toString(){
   return "v1("+ v1.getX()+", "+v1.getY()+")"+" v2("+ v2.getX()+", "+ v2.getY()+")"+" v3("+ v3.getX()+", "+v3.getY()+")";
   }
   public void setVertex(int index, Point newP) {
     if (index==0){
       v1 = newP;
     }
     if (index==1){
       v2 = newP;
     }
     if (index==2){
       v3 = newP;
     }

   }
  // The format should be "v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
}
  // Make new points out of the doubles to store in the instance variables.
