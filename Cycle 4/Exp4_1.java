import java.util.*;
class employee
{
 String name,phno,address;
 int age;
 int salary;
 void getDetails()
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter Name : ");
  name=o.next();
  System.out.println("Enter Age : ");
  age=o.nextInt();
  System.out.println("Enter Phone No : ");
  phno=o.next();
  System.out.println("Enter Address : ");
  address=o.next();
  System.out.println("Enter Salary : ");
  salary=o.nextInt();
 }
 void printDetails()
 {
  System.out.println("Name : "+name);
  System.out.println("Age : "+age);
  System.out.println("Phone No : "+phno);
  System.out.println("Address : "+address);
  System.out.println("Salary : "+salary);
 }
}
class officer extends employee
{
 String spec;
 void getDetails()
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter Specialization : ");
  spec=o.next();
  super.getDetails();
 }
 void printDetails()
 {
  super.printDetails();
  System.out.println("Specialization : "+spec);
 }
}
class manager extends employee
{
 String dep;
 void getDetails()
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter Department : ");
  dep=o.next();
  super.getDetails();
 }
 void printDetails()
 {
  super.printDetails();
  System.out.println("Department : "+dep);
 }
}
public class Exp4_1
{
 public static void main(String args[])
 {
  officer o1=new officer();
  manager o2=new manager();
  System.out.println("Enter Officer Details : ");
  o1.getDetails();
  System.out.println("Enter Manager Details : ");
  o2.getDetails();
  System.out.println("Officer Details :- ");
  o1.printDetails();
  System.out.println("Manager Details :- ");
  o2.printDetails();
 }
}
