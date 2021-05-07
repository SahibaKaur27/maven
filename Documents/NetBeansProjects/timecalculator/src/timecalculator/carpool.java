/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;

import java.util.Scanner;
public class carpool {
     public static void main (String [] args) {
 Scanner input = new Scanner (System.in);
        int totalMiles; 
        int gasolineCost; 
        int milesPerGallon; 
        int parkingFees; 
        int tolls;
        int dailyDrivingCost;
        System.out.println ("This Application Calculates Your Daily Driving Cost");
        System.out.println (); 
        System.out.print ("Enter Total Miles Driven Per Day: ");
        totalMiles = input.nextInt();
        System.out.print ("Enter Cost Per Gallon Of Gasoline: ");
        gasolineCost = input.nextInt();
        System.out.print ("Enter Average Miles Per Gallon: ");
        milesPerGallon = input.nextInt();
        System.out.print ("Enter Parking Fees Per Day: ");
        parkingFees = input.nextInt();
        System.out.print ("Enter Tolls Per Day: ");
        tolls = input.nextInt();
        dailyDrivingCost = (totalMiles / milesPerGallon) * gasolineCost + parkingFees + tolls;
        System.out.println("\n");
        System.out.printf ("Your Daily Driving Cost Is: %d\n", dailyDrivingCost);
     }
 }
