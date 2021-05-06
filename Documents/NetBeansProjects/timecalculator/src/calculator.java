/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAHIBA KAUR
 */
public class calculator {
    
  public static int add(int num,int num1) {
		return num+num1;
	}
	
	public static int sub(int num,int num1) {
		return num-num1;
	}
	
	public static int mul(int num,int num1) {
		return num*num1;
	}
	public static int div(int num,int num1) {
		
	if(num1==0) {
		throw new IllegalArgumentException("Number can not be divide by 0 ");
	}
		return num/num1;

}
 
}
