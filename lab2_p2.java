/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class lab2_p2 {

   
    public static void main(String[] args) {
        
        System.out.println("enter account 1 data (account number,name,balance) ");
        Scanner sc=new Scanner(System.in);
        BankingAccount obj1=new BankingAccount(sc.nextInt(),sc.next(),sc.nextDouble());
        System.out.println("enter account 2 data (account,name,balance)");
        BankingAccount obj2=new BankingAccount(sc.nextInt(),sc.next(),sc.nextDouble());
        obj1.Report();
        obj2.Report();
      
           
        
        BankingAccount [] list=NewClass.readBankingAccountDataFromFile("read.txt");
        int x=0;
        double max=list[0].getBalance();
           list[0].Report();
           for(int j=1;j<list.length;j++){
               list[j].Report();
               if(max<list[j].getBalance()){
                   max=list[j].getBalance();
                   x=j;            
               }
              
               
           }
           System.out.println("The highest balance is");
           list[x].Report();
        System.out.println("Please enter account  data (account number,name,balance) ");
           
        
           
           BankingAccount newOne=new BankingAccount(sc.nextInt(),sc.next(),sc.nextDouble());
           try {
               FileWriter file1=new FileWriter("read.txt",true);
               file1.write("\n"+newOne.getAccountNumber()+","+newOne.getName()+","+newOne.getBalance());
               file1.close();
        } catch (IOException e) {
               System.out.println("error occupied");
        }
          
        
        
        
       
    }
    
}
