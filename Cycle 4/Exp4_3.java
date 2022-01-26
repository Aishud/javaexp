public class Exp4_3
{   
 public static void main(String args[])
 {
  Exp4_3 obj=new Exp4_3();  
  obj=null; 
  Exp4_3 a = new Exp4_3();
  Exp4_3 b = new Exp4_3();
  b = a;
  System.gc();  
 }  
 protected void finalize() throws Throwable
 {
  System.out.println("Garbage collection is performed by JVM");
 }
}
