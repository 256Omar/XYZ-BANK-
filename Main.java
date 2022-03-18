package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to XYZ bank");
        System.out.println("The following are the available account");
        System.out.println("1.REGULAR ACCOUNT");
        System.out.println("2.INTEREST ACCOUNT");
        System.out.println("3.CHECKING ACCOUNT");
        System.out.println("4.CD ACCOUNT");
        Scanner scan=new Scanner(System.in);
        System.out.println("PLEASE ENTER PIN");
        int pin=scan.nextInt();
        if(pin==1){
            System.out.println("charges 10% of the balance at end of month\n there is no interest\n penalty of 10.00 id the balance goes below 50,000.00");
        }
        if(pin==2){
            System.out.println("charges 10% of the balance at end of month\n an interest of 7% paid monthly\n no minimum balance required");
        }
        if(pin==3){
            System.out.println("charges 10% of the balance at end of month\n  annual interest of 15% paid monthly\n penalty of 10.00 if balance goes below 10,000.00\n charge of 0.10 for every transaction");
        }
        if(pin==4){
            System.out.println("charges 10% of the balance at end of month\n annual of 15%\n no minimum balance\n penalty of 20% of the current balance if there is a withdraw before 12months");
        }
        else{
            System.out.println("INCORRECT PIN");
        }
    }
}
