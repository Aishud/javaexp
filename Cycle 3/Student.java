import java.util.*;
class Student
{
 String a;
 int rno,mark[]=new int[5];
 void read()
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter name : ");
  a=o.nextLine();
  System.out.println("Enter roll no : ");
  rno=o.nextInt();
  for(int i=0;i<5;i++)
  {
   System.out.println("Enter the mark in subject "+(i+1)+" : ");
   mark[i]=o.nextInt();
  }
 }
 void print()
 {
  System.out.println("Name : "+a);
  System.out.println("Roll No : "+rno);
  System.out.println("Marks in each subject : ");
  for(int i=0;i<5;i++)
   System.out.println("Subject "+(i+1)+" : "+mark[i]);
  }
 public static void main(String args[])
 {
  Student s=new Student();
  System.out.println("Enter the details of Student :");
  s.read();
  System.out.println("Details are :");
  s.print();
 }
}