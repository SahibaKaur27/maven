/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;

import java.util.Scanner;


public class bonus {
   public static void main(String[] args) 
    {
     Scanner s = new Scanner(System.in);
     System.out.println("enter your monthly salary");
     int n = s.nextInt();
      double bonus=1000+0.02*n*30;
     System.out.println("the bonus is"+bonus);
    
}
}
