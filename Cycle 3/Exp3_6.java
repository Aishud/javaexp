import java.util.*;
class Exp3_6
{
 void concatenate(int x,int y)
 {
  System.out.println("Integer : "+x+y);
 }
 void concatenate(String a, String b)
 {
  System.out.println(a+b);
 }
 public static void main(String args[])
 {
  Scanner o=new Scanner(System.in);
  Scanner o1=new Scanner(System.in);
  Exp3_6 obj=new Exp3_6();
  System.out.println("Choose the type of data :\n1 : Number\n2 : String");
  int z=o.nextInt();
  switch(z)
  {
   case 1:
    System.out.println("Enter the first no : ");
    int x=o.nextInt();
    System.out.println("Enter the second no : ");
    int y=o.nextInt();
    obj.concatenate(x,y);
    break;
   case 2:
    System.out.println("Enter the first string : ");
    String a=o1.nextLine();
    System.out.println("Enter the second string : ");
    String b=o1.nextLine();
    obj.concatenate(a,b);
    break;
   default :
    System.out.println("Error");
    break;
  }
 }
}