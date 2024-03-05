/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;


public class BankingAccount {
    private int accounNumber;
    private String name;
    private double balance;
    public BankingAccount (int accountNumber,String name,double balance){
        this.accounNumber=accountNumber;
        this.name=name;
        this.balance=balance;
    }
    public BankingAccount(){
        
    }
    
    
    public void Report(){
        System.out.println("The data of the  account :");
        System.out.println("Account number:"+this.accounNumber);
        System.out.println("Name :"+this.name);
        System.out.println("balance :"+this.balance);
        System.out.println("The interest Earned ="+ this.CalculateInterestEarned());
        
        
        
    }
    
    
    public void setAccountNumber(int accountNumber){
        this.accounNumber=accountNumber;
     }
    public int getAccountNumber(){
    return this.accounNumber;
    }
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
    return this.name;
    }
    public void setBalance(double balance){
    this.balance=balance;
    }
    public double getBalance(){
    return this.balance;
    }
    
    public double CalculateInterestEarned(){
         double interestEarned = 0;
        if (this.balance>=10000){
            interestEarned=0.05*this.balance;
            
        }
        else if(this.balance>=5000){
            interestEarned=0.03*this.balance;
        }
        else if(this.balance>=1500){
            interestEarned=0.02 *this.balance;
                 
        }
        else if(this.balance>=1000){
            interestEarned=0.01*this.balance;
        }
        else{
            interestEarned=0.005*this.balance;
        }
        return interestEarned;
    }
    
}
