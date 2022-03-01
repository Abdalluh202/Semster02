
package project13;

import java.util.Scanner;

public class Project13 {

    
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println(" أدخل الرقم الاول");
        int num1 = input.nextInt();
        
        System.out.println(" أدخل الرقم الثاني");
        int num2 = input.nextInt();
        printline();
        
        sum1(10, 5);
        printline();
        sum1(num1, num2);
        printline();
        
        int x=sum2(10, 5);
        System.out.println("sum = "+ x);
        printline();
        
        int y=sum2(num1, num2);
         System.out.println("sum = "+ y);
        printline();
        
        int z=sum3();
         System.out.println("sum = "+ z);
        printline();
       
    }
static void printline(){
System.out.println("------------------------");
} 
    
 static void sum1(int first,int second){
 int sum=0;//local variable
sum= first+second ;
System.out.println("sum = "+ sum);
} // end of sum1 
 
 
 static int sum2(int first,int second){
int sum=0; // local variable
sum= first+second ;
return sum ;// returned value
 } // end of sum2
 
 static int sum3(){
     Scanner input = new Scanner(System.in);
 
 int sum;
 System.out.println(" أدخل الرقم الاول");
        int first = input.nextInt();
        
        System.out.println(" أدخل الرقم الثاني");
        int second = input.nextInt();
sum= first+second;
return sum ;
 }
}
