
package project16;

import java.util.Scanner;

public class Project16 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
    int A[]=new int[6];
    int min,max;
    
for (int i =0;i<6;i++)
A[i]=input.nextInt();

min=max=A[0];

for (int j =0;j<6;j++)
if (A[j]<min)
min=A[j];
else if (A[j]>max)
max=A[j];
System.out.println("min="+min);
System.out.println("max="+max);
      
    }
    
}
