
package project6;

import java.util.Scanner;

public class Project6 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println(" أدخل الدرجة من  100");
        int mark= input.nextInt();
        
        if (mark>=60)
           System.out.println("ناجح");
        else 
            System.out.println("راسب");
        
    }
    
}
