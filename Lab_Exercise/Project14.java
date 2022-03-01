
package project14;

import java.util.Scanner;

public class Project14 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
        int arr[]=new int[6];
        
        for (int i =0;i<6;i++)
        arr[i]=input.nextInt();
        
        System.out.println("---------------------");
        
        for (int j =0;j<6;j++)
        System.out.println(arr[j]);
    }
    
}
