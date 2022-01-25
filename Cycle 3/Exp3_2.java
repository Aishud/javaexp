import java.util.*;
class Exp3_2
{
 public static void main(String args[])
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the number : ");
  int n=o.nextInt();
  Exp3_2 obj=new Exp3_2();
  obj.factorial(n);
  obj.sum_of_no(n);
 }
 void factorial(int n)
 {
  int f=1;
  if(n!=0)
   for(int i=1;i<=n;i++)
    f=f*i;
  else
   f=1;
  System.out.println("Factorial : "+f);
 }
 void sum_of_no(int n)
 {
  int d,sum=0;
  while(n!=0)
  {
   d=n%10;
   sum=sum+d;
   n=n/10;
  }
  System.out.println("Sum of no : "+sum);
 }
} 
