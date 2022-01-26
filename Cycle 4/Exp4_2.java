abstract class shape
{
 abstract void no_of_sides();
}
class rectangle extends shape
{
 void no_of_sides()
 {
  System.out.println("No. of sides of Rectangle : 4");
 }
}
class triangle extends shape
{
 void no_of_sides()
 {
  System.out.println("No. of sides of triangle : 3");
 }
}
class hexagon extends shape
{
 void no_of_sides()
 {
  System.out.println("No. of sides of hexagon : 6");
 }
}
class Exp4_2
{
 public static void main(String args[])
 {
  shape s;
  s=new rectangle();
  s.no_of_sides();
  s=new triangle();
  s.no_of_sides();
  s=new hexagon();
  s.no_of_sides();
 }
}