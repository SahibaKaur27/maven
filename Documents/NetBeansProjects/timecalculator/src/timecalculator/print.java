/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecalculator;

/**
 *
 * @author SAHIBA KAUR
 */

class print_text extends Thread
{
 String msg="";
 int  n;
 print_text(String msg,int n)
 {
  this.msg=msg;
  this.n=n;
 }
 public void run()
 {
  try
  { for(int i=1;i<=n;i++)
   {
    System.out.println(msg+" "+i+" times");
   }
  }
  catch(Exception e){}
 }
}

/**
 *
 * @author SAHIBA KAUR
 */
public class print
{
 public static void main(String a[])
 {
  int n=Integer.parseInt(a[0]);
 print_text t1=new print_text("I am in FY",n);
  t1.start();
  print_text t2=new print_text("I am in SY",n+10);
  t2.start();
  print_text t3=new print_text("I am in TY",n+20);
  t3.start();
 }
}
