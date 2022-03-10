import java.io.*;
import java.util.*;
class file_4
{
 public static void main(String args[]) throws Exception
 {
  try
  {
   FileInputStream fin=new FileInputStream("file_4.txt");
   int ch=0;
   String a; int sum=0;
   System.out.println("The Numbers in the file are : ");
   while((ch=fin.read())!=-1)
   {
    String s= Character.toString((char)ch);
    StringTokenizer st=new StringTokenizer(s);
    while(st.hasMoreTokens())
    {
     a=st.nextToken();
     int b=Integer.parseInt(a);
     System.out.println(b);
     sum+=b;
    }
   }
   System.out.println("The sum is : "+sum);
   fin.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}

/*
OUTPUT
The Numbers in the file are :
1
2
3
4
5
6
7
8
9
The sum is : 45
*/
