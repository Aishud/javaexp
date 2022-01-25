import java.util.*;
class String_edit
{
 public static void main(String args[])
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the string :");
  String a=o.nextLine();
  a=a.toLowerCase();
  int n=a.length();
  char s[]=a.toCharArray();
  System.out.println("Enter the position of the character which is to be replaced :");
  int x=o.nextInt();
  System.out.println("Enter the character which is to be replaced :");
  char r=o.next().charAt(0);
  s[x-1]=r;
  String b=new String(s);
  System.out.println(b);
 }
}