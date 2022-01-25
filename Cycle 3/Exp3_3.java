import java.util.*;
class Exp3_3
{
 public static void main(String args[])
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the string : ");
  String a=o.nextLine();
  System.out.println("Enter the character : ");
  char x=o.next().charAt(0);
  a=a.toLowerCase();
  int n=a.length();
  char s[]=a.toCharArray();
  Exp3_3 obj=new Exp3_3();
  obj.frequency(s,n,x);
  obj.reverse(s,n);
 }
 void frequency(char s[],int n,char x)
 {
  int f=0;
  for(int i=0;i<n;i++)
   if(s[i]==x)
    f++;
  if(f!=0)
   System.out.println("The character occurs "+ f +" times");
  else
   System.out.println("The character is not present");
 }
 void reverse(char s[],int n)
 {
  char r[]=new char[n];
  for(int i=0;i<n;i++)
   r[i]=s[n-i-1];
  String b=new String(r);
  System.out.println(b);
 }
}