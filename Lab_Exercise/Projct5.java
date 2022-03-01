
package projct5;

import java.util.Scanner;


public class Projct5 {

  
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println(" أدخل أسمك");
        String name = input.next();
        
        System.out.println(" أدخل الرقم الاول");
        double firstnum = input.nextDouble();
       
        
        System.out.println(" أدخل الرقم الثاني");
        double secondnum = input.nextDouble();
        
        
        double sum = firstnum + secondnum;
        System.out.println(" المجموع هو:"+ sum);
        
       
        double sub = firstnum - secondnum;
        System.out.println(" ناتج الطرح هو:"+ sub);
        
        double mul = firstnum * secondnum;
        System.out.println(" ناتج الضرب هو:"+ mul);
        double div =firstnum/secondnum;
        
        System.out.println(" خارج القسمة هو:"+div);
        
        
        double mod= firstnum%secondnum;
        System.out.println(" باقي  القسمة هو:"+mod);
        
        
         System.out.println("Your name is: "+name);
        int a=70;
        if (a>=60){
         System.out.println("pass");
        System.out.println("pass");
        }
        else {
           System.out.println("fail");
           System.out.println("fail");
        }
        
    }
    
}
