
package projct11;

import java.util.Scanner;

public class Projct11 {

    
    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
      int stid=1;
      
     while (stid<=5)
     {
        System.out.println(" أدخل الدرجة من  100");
        int mark= input.nextInt();
        
       
          if (mark>100 || mark<0 )
              System.out.println("wrong mark");
       else if (mark>=90)
            System.out.println("The grade is: A");
        
        else if (mark>=80)
            System.out.println("The grade is: B");
        
        else if (mark>=70) 
            System.out.println("The grade is: C");
        
        else if (mark>=60)
            System.out.println("The grade is: D");
        
        else 
            System.out.println("The grade is: F");
          
          stid = stid+1;
          
     }
       
    }
    
}
