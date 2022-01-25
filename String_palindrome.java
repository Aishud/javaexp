import java.util.*;
class String_palindrome
{
 public static void main(String args[])
 {
  String a,b="";
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the string: ");
  a=o.nextLine();
  int n=a.length();
  for(int i=n-1;i>=0;i--)
  {
   b=b+a.charAt(i);
  }
  if(a.equals(b))
   System.out.println("The string is palindrome");
  else
   System.out.println("The string is not palindrome");
 }
}