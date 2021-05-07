/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;

import java.util.Scanner;

public class Timecalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The time taken by a mail to reach it's destination ");
        System.out.println("Enter the no.of days");
        int days = input.nextInt();
        System.out.println("Enter the no.of hours");
        int hours = input.nextInt();
        System.out.println("Enter the no.of mins");
        int mins = input.nextInt();
        System.out.println("Enter the no.of seconds");
        int secs = input.nextInt();
        int t1=days*24*60*60;
        int t2=mins*60*60;
        int total=t1+t2+secs;
        System.out.println("The total time taken by a mail to reach it's destination in seconds is:"+total+"seconds");
	
        // TODO code application logic here
    }
    
}
