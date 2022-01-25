import java.util.*;
class perimeter
{
 void perimeter(float r)
 {
  float p=(2*22*r)/7;
  System.out.println("Perimeter = "+p);
 }
 void perimeter(float l,float b)
 {
  float p=2*(l+b);
  System.out.println("Perimeter = "+p);
 }
}
class Exp3_5 
{
 public static void main(String args[])
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Choose the shape whose perimeter is to be calculated\n1: Circle\n2: Rectangle");
  int x=o.nextInt();
  perimeter obj=new perimeter();
  switch(x)
  {
   case 1:
    System.out.println("Enter the radius : ");
    float r=o.nextFloat();
    obj.perimeter(r);
    break;
   case 2:
    System.out.println("Enter the length : ");
    float l=o.nextFloat();
    System.out.println("Enter the breadth : ");
    float b=o.nextFloat();
    obj.perimeter(l,b);
    break;
   default :
    System.out.println("Error");
  }
 }
}