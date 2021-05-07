package timecalculator;

import java.io.DataInputStream;

/**
 *
 * @author SAHIBA KAUR
 */
interface IntOperation{
    void PosNeg();  
    void Prime();
    void EvenOdd(); 
    void Factorial();  
    void Sod();
        
    
}
class MyNumber implements IntOperation { 
    private int no;
MyNumber()
{  
    no=0;
}
    MyNumber(int num)
{  
    no=num;
}
    public void PosNeg() 
      {   System.out.println("==========================================");  
      if(no<0)   {    System.out.println(no+" No is negative");   } 
      else if(no>0)   
      {    System.out.println(no+" No is positive");   }       
      else   {    System.out.println(no+" No is positive");    } 
      System.out.println("==========================================");    }    
    

  
    public void Prime() {
        int flag=0;  
        for(int i=2;i<no;i++)  
        {    if(no%i==0)   
        {     flag=1;    }
        } 
        System.out.println("==========================================");   
        if(flag==1)   {    System.out.println(no+" No is not prime");    }  
        else   {    System.out.println(no+" No is prime");    }  
        System.out.println("=========================================="); 
    }

   
    public void EvenOdd() {
       System.out.println("=========================================="); 
       if(no%2==0) 

     
  {    System.out.println(no+" No is even");    } 
       else   {    System.out.println(no+" No is odd");    }   
       System.out.println("=========================================="); 
    }

   
    public void Factorial() {
        int fact=1;
        for( int i=1;i<=no;i++)  
        {    fact=fact*i;    }  
        System.out.println("==========================================");   
        System.out.println("Factorial of "+ no +" is = "+fact);   
        System.out.println("============");
    }


    public void Sod() {
       {   int sum=0,rem=0,n=0;   while(no>0)  
       {    rem=no%10;    sum=sum+rem;    no=no/10;         }   
       System.out.println("==========================================");   
       System.out.println("Sum of  digits = "+sum);  
       System.out.println("==========================================");    
 
 }
    }
} 

class Operation {  public static void main(String... args)throws Exception  { 
DataInputStream in=new DataInputStream(System.in);  
int no1,ch,ch1;   MyNumber m; 
System.out.print("Enter the Number :=");   
no1=Integer.parseInt(in.readLine());  
m=new MyNumber(no1); 
do   {   System.out.println("=========================================="); 
System.out.println("1. Odd/Even");
System.out.println("==========================================");  
System.out.println("2. Prime/NotPrime");  
System.out.println("==========================================");  
System.out.println("3. Positive/Negative"); 
System.out.println("==========================================");  
System.out.println("4. Factorial"); 
System.out.println("=========================================="); 
System.out.println("5. Sum of digits"); 
System.out.println("==========================================");  
System.out.println("6. Exit"); 
System.out.println("==========================================");   
System.out.print("Enter the Choice :="); 
ch=Integer.parseInt(in.readLine()); 
 if(ch==1)  
 {     m.EvenOdd();   }   
 else if(ch==2)  
 {     m.Prime();   }
 else if(ch==3)  
 {    m.PosNeg();   } 
 else if(ch==4)   
 {     m.Factorial();   } 
 else if(ch==5) 

    
  {    m.Sod();   }  
 else if(ch==6)  
 {    break;   } 
 System.out.println("=========================================="); 
 System.out.println("Press 0 for continue \nPress 1 for exit"); 
 System.out.print("Enter the Choice............");  
 ch1=Integer.parseInt(in.readLine());   
 System.out.println("==========================================");   }  
while(ch1==0); 
 
 } } 
 