import java.util.*;
class String_frequency
{
 public static void main(String args[])
 {
  int f=0;
  Scanner o=new Scanner(System.in);
  System.out.println("Enter the string :");
  String a=o.nextLine();
  a=a.toLowerCase();
  int n=a.length();
  char s[]=a.toCharArray();
  System.out.println("Enter the character which is to be searched :");
  char x=o.next().charAt(0);
  for(int i=0;i<n;i++)
   if(s[i]==x)
    f++;
  if(f!=0)
   System.out.println("The character repeats "+f+" times");
  else
   System.out.println("The character is not present");
 }
}