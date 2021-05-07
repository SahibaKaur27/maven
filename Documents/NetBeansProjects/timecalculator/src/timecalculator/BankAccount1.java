package timecalculator;



import java.util.*;

class BankAccount{
    String name,acc_type;
    int Acc_num,Acc_Balance;
    BankAccount(){
      
    }
        BankAccount(String n,int acc_num,int b,String a_t){
            name=n;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
        }
} 

class acc extends BankAccount{
    acc(String n,int acc_num,int b,String a_t){ 
            name=n;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
    }
    acc(){
        super();
    }
        
    void in(String n,int acc_num,String a_t){
        name=n;
        acc_type=a_t;
        Acc_num=acc_num;
        Acc_Balance=0;
    }
    
    void disp(){
        System.out.println("Depositor Name :" +name);
        System.out.println("Account Number : "+Acc_num);
        System.out.println("Account Balance : "+Acc_Balance);
        System.out.println("Account Type : "+acc_type);
    }
 
        void depo(int acc_num,int money){                 
                Acc_Balance=money;    
        }
        
        int with(int withd){
                Acc_Balance=Acc_Balance-withd;
                return Acc_Balance;
        }
  
}  

      
public class BankAccount1 {
    public static void main(String args[]){
        String user_name=null,type;
        type = null;
        int balance=0,temp=0;
        int with=0,c=0; 
int aNumber = 1000; 


        acc user = new acc("user",0,0,"savings"); 
    
            Scanner in = new Scanner(System.in);
            Scanner s=new Scanner(System.in);
            int userChoice;
            boolean quit = false;

            do {
                  System.out.println("1. Create Acc");
                  System.out.println("2. Deposit money");
                  System.out.println("3. Withdraw money");
                  System.out.println("4. Check balance");
                  System.out.println("5. Display Account Details");
                  System.out.println("0. to quit: \n");
                  System.out.print("Enter Your Choice : ");
                  userChoice = in.nextInt();
                  switch (userChoice) {
                      
                  case 1:
                        System.out.print("Enter Name : ");
                        user_name=s.nextLine(); 
                        System.out.print("Enter AccType : ");
                        type=in.next();
                        user.in(user_name, aNumber, type);  
                        System.out.println("\n\tYour Acc Details\n\tDont Forget Acc No\n");                       
                        user.disp();
                        break;
                      
                case 2: 
                    System.out.print("Enter Acc No : ");
                    temp=in.nextInt();
                 if(temp==user.Acc_num){
                 System.out.print("Enter Amount Of Money : ");
                 balance=in.nextInt();
                 user.Acc_Balance=balance;
                 System.out.println("\t Successfully Deposited.");
              }                
                     else
                    System.out.println("INCORRECT.");          
                   break;
                    
                  case 3:                     
                     System.out.print("Enter  Acc No : ");
                      temp=in.nextInt();
                      
                          if(temp==user.Acc_num){                         
                             if(user.Acc_Balance==0)
                             System.out.print(" Empty.");
                             
                             else{
                             System.out.print("Enter Amount Of Money : ");   
                             with=in.nextInt();  
                             
                             if(with>user.Acc_Balance){
                             System.out.print("Enter Valid Amount of Money : ");
                             with=in.nextInt();
                             }
                             else
                             c= user.with(with);
                             System.out.println(" Current Balance : "+c);   
                             }
                          }
                             else
                             System.out.println("INCORRECT.");  
                        break;
                  case 4:
                      System.out.print("Enter  Acc No : ");
                      temp=in.nextInt();
                             if(temp==user.Acc_num){
                             System.out.println(" Current Balance : "+user.Acc_Balance);
                             }
                             else
                             System.out.println("INCORRECT.");                         
                      break;
                  case 5:
                      System.out.print("Enter  Acc No :");
                      temp=in.nextInt();                     
                             if(temp==user.Acc_num){                               
                             user.disp();                             
                        }else
                             System.out.println("INCORRECT.");        
                      break;
                  case 0:
                        quit = true;
                        break;
                  default:
                        System.out.println("INCORRECT.");
                        break;
                  }
                  System.out.println("\n");
            } while (!quit);
            
     }   
}