import java.io.*;
class linenum
{
 public static void main(String args[])
 {
  try
  {
    FileReader f1= new FileReader("inputfile.txt");
    BufferedReader b1=new BufferedReader(f1);
    int i=0, j=1;
    String s =b1.readLine();
    while(s!=null)
    {
      System.out.print(j+". ");
      System.out.print(s); 
      s=b1.readLine();
      System.out.println();
      j++;
    }
  }
  catch(Exception e)
  {}
 }
}

/*
OUTPUT
1. hello
2. nice to meet you
3. what a pleasant day
4. goodbye
*/
