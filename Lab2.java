
package com.mycompany.lab2;

import static java.lang.Math.sqrt;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class Lab2 {
    
    public static void perfectSquare(){
        int N;
        System.out.print("You should enter a positive number :");
        Scanner sc =new Scanner(System.in);
        N=sc.nextInt();
        while (N<0){
            System.out.print("You should enter a positive number :");
            Scanner sc1 =new Scanner(System.in);
            N=sc1.nextInt();
        
        }
        for(int i=1;i<=(int)sqrt(N);i++){
            System.out.print(i*i +",");
            
        
        } System.out.println();
        
    }

    public static void main(String[] args) {
        perfectSquare();
    }
}
