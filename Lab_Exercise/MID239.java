
package mid2.pkg39;

import java.util.Scanner;

public class MID239 {

   
    public static void main(String[] args) {
       
     
        Scanner input = new Scanner(System.in);
        
        for(int co=1; co<=3; co++)
        {
            System.out.println(" أدخل اجمالي استهلاك الكهرباء للستة أشهر الاولى من العام ");
        int c1= input.nextInt();
        
        System.out.println(" أدخل اجمالي استهلاك الكهرباء للستة أشهر الثانية من العام");
        int c2= input.nextInt();
        
        int total= sum(c1,c2);
        if (total>=100000)
           System.out.println("استهلاك المصنع عالي ");
        else 
            System.out.println("استهلاك المصنع معتدل");
        }
        
    }
    
     static int sum(int first,int second){
int sum1; // local variable
sum1= first+second ;
return sum1 ;// returned value
 } // end of sum2
    
}
