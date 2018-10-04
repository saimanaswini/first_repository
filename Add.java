import java.lang.*;
import java.util.*;
class Add
{
 public void sum()
  { 
   int c,d;
    c=4;
    d=45;
   Scanner sc=new Scanner(System.in);
 System.out.println("enter the two numbers to be added");
   int a=sc.nextInt();
   int b=sc.nextInt();
   
   System.out.println((a+b)+"\t"+(c+d));
  }
 
 public static void main(String args[])
  {
    Add s=new Add();
    s.sum();
  }
}