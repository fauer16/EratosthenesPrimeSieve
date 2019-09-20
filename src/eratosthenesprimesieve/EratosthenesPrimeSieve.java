/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenesprimesieve;

import java.util.Scanner;

/**
 *
 * @author Flo
 */
public class EratosthenesPrimeSieve {
    static final Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1.....Zahl prüfen");
        System.out.println("2.....Zahlen bis Limit ausgeben");
        int count = 0;
        while(count == 1||count == 2)
        {
            count = s.nextInt();
            
            
        }
         
        if(count == 1)
        {
            System.out.println("Geben sie die zu prüfende Zahl ein:");
            count = s.nextInt();
            if(prime(count))
            {
                System.out.println(count + " is a prime!");
            }
            else
            {
                System.out.println(count + " is not a prime!");
            }
            
        }
        else if(count == 2)
        {
            System.out.println("Geben sie die das Limit ein:");
            count = s.nextInt();
            toPrime(count);
        }
        System.out.println("Bitte geben Sie die zu Prüfende Zahl ein");
        
    }
    
    public static boolean prime(int number)
    {
        return true;
    }
    public static void toPrime(int number)
    {
        
    }
    
}
