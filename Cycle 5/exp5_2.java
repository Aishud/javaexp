import java.io.*;
class filedetails
{
 public static void main(String args[])
 {
  try
  {
   FileReader f1=new FileReader("inputfile.txt");
   BufferedReader b=new BufferedReader (f1);
   int l=0,w=0,c=0;
   String s=b.readLine();
   while(s!=null)
   {
    l++;
    String[] word=s.split(" ");
    w=w+word.length;
    for(String i:word)
    {
     c=c+i.length();
    }
    s=b.readLine();
   }
   System.out.println("Number of lines:"+l);
   System.out.println("Number of words :"+w); 
   System.out.println("Number of characters :"+c);
  }
  catch(Exception e)
  {System.out.println("Error");}
 }
}



/*
Output:
Number of lines:
Number of words :10
Number of characters :47
*/
