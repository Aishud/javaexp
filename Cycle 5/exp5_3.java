import java.io.*;
import java.util.*;
class adddetails
{
 public static void main(String args[])
 {
  try
  {
   FileWriter fw=new FileWriter("hii.txt");
   FileReader fr=new FileReader("hii.txt");      
   fw.write("Name:Aiswarya Das\n");
   fw.write("Address:Ayyankovil\n");
   fw.close();
   int i;
   while((i=fr.read())!=-1)
   {
    System.out.print((char)i); 
   }
   fr.close();
  }
  catch(Exception e)
  {System.out.println("Error");}
 }
}
