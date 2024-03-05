/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NewClass {
    
    public static BankingAccount[] main(String filename){
    BankingAccount[]list=readBankingAccountDataFromFile(filename);
    return list;
    }
    
    public static BankingAccount[] readBankingAccountDataFromFile(String filename)
    {   int i = 0;
        int N = 0;
        try{
           File f1 = new File(filename);
           Scanner sc = new Scanner(f1);
           if (sc.hasNextLine())
           {
               N = sc.nextInt();
               String data = sc.nextLine();
           }
           sc.close();
        }
        catch(FileNotFoundException e)
            {
                System.out.println("error occured");
            }
        
        BankingAccount[] list = new BankingAccount[N];
           try
           {
               File f1 = new File(filename);
               Scanner sc = new Scanner(f1);
           while(sc.hasNextLine())
           {
               sc.nextLine();
            while (sc.hasNextLine())
           {
               String data[] = sc.nextLine().split(",");
               list[i] = new BankingAccount(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]));
               
               i=i+1;
               
           }
           }
           sc.close();
           
        }catch(FileNotFoundException e)
        {
           System.out.println("error occured");
        }
           
           
        return list;
    }}