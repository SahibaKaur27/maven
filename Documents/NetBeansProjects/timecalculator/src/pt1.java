
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAHIBA KAUR
 */
public class pt1 {
    public static void main(String args[]){
    char f='a';
   
            
		System.out.println("Enter String to be checked: "); 
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char[] ch = new char[s.length()];
		for(int i =0;i<s.length();i++) {
			ch[i] = s.charAt(i);
			
			switch(f)
			{
			case 'a': if(ch[i]=='1') f = 'b';
			else if(ch[i] == '0') f = 'a';
			break;
			case 'b': if(ch[i]=='1') f = 'c';
			else if(ch[i] == '0') f = 'b';
			break;
			case 'c': if(ch[i]=='1') f = 'd';
			else if(ch[i] == '0') f = 'c';
			break;
			case 'd': if(ch[i]=='1') f = 'e';
			else if(ch[i] == '0') f = 'd';
			break;
			case 'e': if(ch[i]=='1') f = 'e';
			else if(ch[i] == '0') f = 'e';
			
			}
		}
		if(f == 'a' || f == 'b' || f == 'c' || f == 'd') {
			System.out.println("DFA is accepted.");
		}else {
			System.out.println("DFA is not accepted.");
		}
                
                
    }}
