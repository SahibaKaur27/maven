/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;


import java.util.Scanner;
public class average {
    public static void main(String[] args)
    {
        String first,last ;
        int av;
      System.out.println("enter no.of students:");
      Scanner input = new Scanner(System.in);
      int n=input.nextInt();
     for(int i=1;i<=n;i++)
     {
         System.out.println("enter the first name");
         first = input.next();
         System.out.println("enter the last name");
         last = input.next();
         System.out.println("enter the hindi marks"); 
           int h = input.nextInt();
      
          System.out.println("enter the maths marks");
          int m = input.nextInt();
          System.out.println("enter the science marks");
          int s = input.nextInt(); 
          System.out.println("enter the english marks"); 
          int e = input.nextInt();
          av=(m+s+e+h)/4;
          
          System.out.println("the last name is "+last); 
          System.out.println("the average is "+av); 
         }
  }
   
 }

