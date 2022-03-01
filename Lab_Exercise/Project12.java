
package project12;

import java.util.Scanner;

public class Project12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" أدخل الرقم  المراد حساب قيمته المطلقة");
        double abs = input.nextDouble();
        System.out.println("القيمة المطلقة للرقم المدخل هي"+ Math.abs (abs));
        System.out.println("--------------------------------");
        
        System.out.println(" أدخل الرقم المراد تقريبة للاعلى");
        double rup = input.nextDouble();
        System.out.println("الرقم بعد تقريبة لاعلى عدد صحيح"+ Math.ceil (rup));
        System.out.println("--------------------------------");
        
        System.out.println(" أدخل الرقم المراد تقريبة للأدنى");
        double rdown = input.nextDouble();
        System.out.println("الرقم بعد تقريبة لادنى عدد صحيح"+ Math.floor (rdown));
        System.out.println("--------------------------------");
        
        System.out.println(" أدخل الرقمين المطلوب المقارنة بينهم");
        System.out.println(" أدخل الرقم الاول");
        double x = input.nextDouble();
        System.out.println(" أدخل الرقم الثاني");
        double y = input.nextDouble();
      
        System.out.println("الرقم الاكبر هو: "+ Math.max(x,y));
        System.out.println("--------------------------------");
        System.out.println("الرقم الاصغر هو: "+ Math.min(x,y));
        System.out.println("--------------------------------");
        
        System.out.println(" أدخل الرقم المراد حساب جذرة التربيعي");
        double sr= input.nextDouble();
        System.out.println(" الجذر التربيعي هو:"+Math.sqrt(sr) );
         System.out.println("--------------------------------");
        
        
       
    }
    
}
