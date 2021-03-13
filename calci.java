import java.util.*;
//import java.Util.Scanner;
 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   {
     
 
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome To Command Line Calculator!");
    System.out.println("1 \t 2 \t 3 \n ");
    System.out.println("4 \t 5 \t 6 \n ");
    System.out.println("7 \t 8 \t 9 \n ");
    System.out.println("× \t 0 \t = \n ");
    System.out.println("% \t ✓ \t + \n ");
    System.out.println("- \t / \t ÷ \n ");
    System.out.println("enter your first number \n ");
    int a= sc.nextInt();
    System.out.println("choose  a integer for operator 1.add 2.sub 3.multiplication 4.division \n ");
    int c = sc.nextInt();
    System.out.println("Enter second number \n ");
    int b = sc.nextInt();
    if(c == 1)
        {
           System.out.println(a+b);
         }
     if(c == 2) {System.out.println(a-b);}    
     if(c==3){System.out.println(a*b);}
     if(c==4){System.out.println(a/b);}
     else{System.out.println("thank you for using calculator");
        }
      
    }
  }
 
