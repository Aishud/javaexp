import java.util.*;
class Square extends Thread
{
 Square(int x)
 {
 System.out.println("Square of " + x + " = " + (x*x) );
 }
}
class Cube extends Thread
{
 Cube(int x)
 {
 System.out.println("Cube of " + x + " = " + (x*x*x) );
 }
}
class Number extends Thread
{
 public void run()
 {
  Random random = new Random();
  for(int i =0; i<5; i++) {
   int r = random.nextInt(100);
    System.out.println("Random Integer generated : " + r);
   if(r%2==0){
    Square s = new Square(r);
   }
   else{
    Cube c = new Cube(r);
   }
   try {
    Thread.sleep(1000);
   } 
   catch (InterruptedException ex) {
    System.out.println(ex);
   }
  }
 }
}
public class functn {
 public static void main(String args[])
 {
  Number n = new Number();
  n.start();
 }
}

/*
OUTPUT
Random Integer generated : 96
Square of 96 = 9216
Random Integer generated : 58
Square of 58 = 3364
Random Integer generated : 25
Cube of 25 = 15625
Random Integer generated : 57
Cube of 57 = 185193
Random Integer generated : 52
Square of 52 = 2704
*/
