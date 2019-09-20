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
        showmenue();

    }

    public static void showmenue() {
        
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1.....Zahl prüfen");
        System.out.println("2.....Zahlen bis Limit ausgeben");
        System.out.println("3.....Primadditionen");
        System.out.println("0.....Beenden");
        System.out.println("-----------------------------------------------------------------------");
        int count = s.nextInt();
        while (count != 1 && count != 2&&count!=3) {
            System.out.println("Geben sie bitte eine Zahl von 1-2 ein");
            count = s.nextInt();

        }

        if (count == 1) {
            System.out.println("Geben sie die zu prüfende Zahl ein:");
            count = s.nextInt();
            if (prime(count)) {
                System.out.println(count + " is a prime!");
            } else {
                System.out.println(count + " is not a prime!");
            }

        } else if (count == 2) {
            System.out.println("Geben sie die das Limit ein:");
            count = s.nextInt();
            printPrimes(toPrime(count));
        }
        System.out.println("Bitte geben Sie die zu Prüfende Zahl ein");
        System.out.println("-----------------------------------------------------------------------");
        if(count !=0)
        {
            showmenue();
        }
        
    }

    public static boolean prime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String toPrime(int number) {
        String primeNumbers = "";
        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + ", ";
            }
        }
     
        return primeNumbers;
    }

    public static void printPrimes(String primeNumbers) {
        System.out.println(primeNumbers);
    }

}
