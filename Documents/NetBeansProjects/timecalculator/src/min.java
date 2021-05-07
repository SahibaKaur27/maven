/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAHIBA KAUR
 */
import java.util.Arrays; 
public class min {
 
  static int min;

    public static void min(int my_array[]) {
     
        min = my_array[0];
        
        for (int i = 1; i <10; i = i + 2) {
            if (i + 1 > 10) {
              
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
          
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                
            }
        }
    }

    public static void main(String[] args) {
           int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        min(my_array);
        System.out.println(" Original Array: "+Arrays.toString(my_array));

        System.out.println(" Minimum value for the above array = " + min);
    }
}
