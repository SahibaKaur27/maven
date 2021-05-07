
import java.util.*;
class salary
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the salary: ");
double a = sc.nextDouble();
if(a<10000)
{
System.out.println("Increentwill be: "+(a/100)*15); 
}
else if(a>200000)
{ System.out.println("Increment will be: "+(a/100)*5); }else { System.out.println("Increment will be: "+(a/100)*10); }
}
}