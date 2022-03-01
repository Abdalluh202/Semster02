
package mid.pkg2.pkg38;

import java.util.Scanner;

public class MID238 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        
        for(int co=1; co<=3; co++)
        {
            System.out.println(" أدخل اجمالي مبيعات الفرع الاول");
        int br1= input.nextInt();
        
        System.out.println(" أدخل اجمالي مبيعات الفرع الثاني");
        int br2= input.nextInt();
        
        int total= sum(br1, br2);
        if (total>=50000)
           System.out.println("الشركة رابحة");
        else 
            System.out.println("الشركة خاسرة");
        }
        
    }
    
     static int sum(int first,int second){
int sum=0; // local variable
sum= first+second ;
return sum ;// returned value
 } // end of sum2
    
}