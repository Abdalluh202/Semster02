
package mid2;

import java.util.Scanner;

public class Mid2 {

   
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
        
        
        
        for(int stid=1; stid<=3; stid++)
        {
            System.out.println(" أدخل درجة أعمال السنة");
        int mark1= input.nextInt();
        
        System.out.println(" أدخل درجة الاختبار النهائي");
        int mark2= input.nextInt();
        
        int total= sum(mark1, mark2);
        if (total>=60)
           System.out.println("ناجح");
        else 
            System.out.println("راسب");
        }
        
    }
    
     static int sum(int first,int second){
int sum=0; // local variable
sum= first+second ;
return sum ;// returned value
 } // end of sum2
    
}
