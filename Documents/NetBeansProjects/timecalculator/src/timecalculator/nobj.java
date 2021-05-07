/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;
import java.util.Scanner;
public class nobj {
    public static void main(String[] args) 
    {
     Scanner s = new Scanner(System.in);
     System.out.println("enter the no.of students");
     int n = s.nextInt();
     for(int i=1;i<=n;i++)
     {
       System.out.println("enter the name");
       String name= s.next();
       System.out.println("enter the percentage");
      String percent= s.next();
      System.out.println("Your roll no is:"+i);
     }
    
}}
