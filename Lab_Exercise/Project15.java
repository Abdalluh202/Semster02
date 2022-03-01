package project15;

import java.util.Scanner;

public class Project15 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int u=0;
    while(u<3){
    int arr[]=new int [3];
    int max , man;
    int i = 0;
    {
            while(i<3){
                 arr[i]=in.nextInt();
                 man=max=arr[0];
                 for (int D= 0;D<3;D++)
                     if(arr[D]<man)
                         man=arr[D];
                     else if(arr[D]>max)
                         max=arr[D];
            i++;
                    
             System.out.println("MAX"+max);
                System.out.println("MIN"+man);
               
    }
             
            u++;
    }
    }
}