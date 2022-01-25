import java.util.*;
class String_search
{
 public static void main(String args[])
 {
  int p=0;
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the string : ");
  String a=o.nextLine();
  a=a.toLowerCase();
  int n=a.length();
  char s[]=a.toCharArray();
  System.out.println("Enter the character which is to be searched :");
  char x=o.next().charAt(0);
  for(int i=0;i<n;i++)
  {
   if(x==s[i])
   {
    p=i+1;
    System.out.println("The character is present at "+p);
   }
  }
  if(p==0)
   System.out.println("The character is not present");
 }
}