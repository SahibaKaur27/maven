/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal;

/**
 *
 * @author SAHIBA KAUR
 */
public class calc {
     public static int add(int number,int number2) {
	  return number+number2;
  }
  public static int sub(int number,int number2) {
	  return number-number2;
  }
  public static int mul(int number,int number2) {
	  return number*number2;
  }
  public static double div(double number,double number2) {
	  if(number2==0) {
		  throw new IllegalArgumentException("Number can not be divide by 0");
	  }
	  return number/number2;
  }
  public static void main(String args[])
	{
		System.out.printf("Calculator is created");
}
    
}
