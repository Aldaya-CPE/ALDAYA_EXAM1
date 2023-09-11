/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aldaya_exam1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vea
 */
public class ALDAYA_EXAM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
       
       boolean continueLoop = true;
            
            while (continueLoop) {
              System.out.println("ALDAYA_Exam1");   
            System.out.println("Choose an number:");
        System.out.println("No#3------1");
        System.out.println("No#5------2");
        
            int select = scanner.nextInt();
              switch (select) {
                case 1:
                     number3();
                  
                    break;
                case 2:
                     number5();
                  
                    break;
             
                case 0:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
              }
    }
    
    
        
        
    }
       
        public static void number3(){
         int[]arr={5,16,15,21,400,44};
           System.out.println("your elements"  + Arrays.toString(arr));
           
            System.out.println("size of your element:");
        for (int i = 0;i <arr.length;i++){
                if(arr[i]>i*3){
                    System.out.println(arr.length);
        }
        }
}
        
        
        
      public static void number5(){
         System.out.println("the first ten numbers:");
        for(int i=0; i<10; i++)
            System.out.println(fibonacci(i)+" ");
    }
    
     public static int fibonacci(int n){
     if(n==0){
        return 0;
      }else if(n==1){
        return 1;
      }else{
      return fibonacci(n-1)+ fibonacci(n-2);
}
          
     }
}
    
    

        

