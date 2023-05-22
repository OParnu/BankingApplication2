/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Parnu
 */
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank("");
        Account account = null;
        int option = 0 , accountNumber;
        String accountName;
        double amount, balance = 0;
        
        while (option != 6) {
            System.out.println("Main Menu");
            System.out.println("1. Display all Account");
            System.out.println("2. Open New Account");
            System.out.println("3. Close Existing Account");
            System.out.println("4. Deposit Money ");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");

            System.out.print("Enter your choice : ");
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1:
                    bank.listAccount();
                    break;
                case 2:
                    accountNumber = genarateAccountNumber();
                    System.out.print("Enter Your Account Name : ");
                    accountName = scan.nextLine();
                    System.out.print("Enter Your Intital Balance : ");
                    balance = scan.nextDouble();
                    bank.openAccount(accountNumber, accountName,balance);
                    break;
                case 3:
                    System.out.print("Enter Your Account Number : ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    bank.closeAccount(accountNumber);
                    break;
                case 4:
                    System.out.print("Enter Your Account Number : ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Your Amount : ");
                    amount = scan.nextDouble();
                    bank.depositMoney(accountNumber, amount);
                    break;
                case 5:
                    System.out.print("Enter Your Account Number : ");
                    accountNumber = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Your Amount : ");
                    amount = scan.nextDouble();
                    bank.withdrawMoney(accountNumber, amount);
                    break;
            }
            System.out.println("------");
        }

    }
    public static int genarateAccountNumber(){
        Random random = new Random();
        int accNumber = 100000 + random.nextInt(900000);
        return accNumber;
    }

}
