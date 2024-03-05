/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example.pkg2;

import java.util.*;


public class lab2_p2 {
    

   
    public static void main(String[] args) {
        Range object1=new Range(0,0);
        Range object2=new Range(0,0);
        System.out.println("Please enter the start of the first range");
        Scanner sc= new Scanner(System.in);
        object1.setStart(sc.nextInt());
         
        System.out.println("Please enter the end of the first range");
        object1.setEnd(sc.nextInt());
        
         System.out.println("Please enter the start of the second range");
        
         object2.setStart(sc.nextInt());
          System.out.println("Please enter the end of the second range");
        object2.setEnd(sc.nextInt());
        
         
        
        
        
        
        
        Range object3=object1.intersection(object2);
       if (object3!=null){
            System.out.println( "The intersection of the two ranges is ["+object3.getStart()+","+object3.getEnd()+"]");
        System.out.println("The intersection contains zero ?");
        
        if (object3.contains(0)){
            System.out.println("Yes");    
        }
        else{ System.out.println("No");  }
        
   
       }else{
           System.out.println("There is no intersection  range");
       }
    } 
    
}
