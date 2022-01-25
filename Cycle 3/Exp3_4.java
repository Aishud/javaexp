import java.util.*;
class Exp3_4
{
 public static void main(String args[])
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Choose the shape whose area is to be calculated \n1 : Circle\n2:Rectangle");
  int x=o.nextInt();
  Exp3_4 obj=new Exp3_4();
  switch(x)
  {
   case 1:
    System.out.println("Enter the radius : ");
    float r=o.nextFloat();
    obj.area(r);
    break;
   case 2:
    System.out.println("Enter the length : ");
    float l=o.nextFloat();
    System.out.println("Enter the breadth : ");
    float b=o.nextFloat();
    obj.area(l,b);
    break;
   default :
    System.out.println("Error");
  }
 }
 void area(float r)
 {
  float a=(22*r*r)/7;
  System.out.println("Area of the circle= "+a);
 }
 void area(float l,float b)
 {
  float a=l*b;
  System.out.println("Area of the rectangle= "+a);
 }
}