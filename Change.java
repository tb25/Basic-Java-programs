//****************************************************************
//Tyler Burse - tjb2147
//Project 1 - P4.8
//COMS W1004
//Professor Cannon
//*****************************************************************

import java.util.Scanner;

public class Change
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);

        //this sets the amount of money, so it cannot be changed//
        final int DOLLAR = 100;
        final int QUARTER = 25; 
        final int DIME = 10;
        final int NICKLE = 5;
        final int PENNY = 1;

        //this asks the user to input the values.//        
        System.out.print("Amount due in pennies :");   
        int cost = in.nextInt();
        System.out.print("Amount recieved in pennies :");
        int paid = in.nextInt();    

        //this subtracts the inputs to give the mount due//
        int due = paid - cost;
        
        /*this evaluates how much change should be given back for each 
        coin*/
        int DR = due % DOLLAR;
        int DD = due / DOLLAR;

        int qD = DR / QUARTER;
        int qR = DR % QUARTER;

        int dd = qR / DIME;
        int dr = qR % DIME;

        int nD = dr / NICKLE;
        int nR = dr % NICKLE;

        int pD = nR / PENNY;

        //this prints out how much is due on a seperate line//
        System.out.println("Dollars due: " + DD + "\nQuarters due: " + qD + 
        "\nDimes due: " + dd + "\nNickels due: " + nD + "\nPennies due: " + 
        pD);

        /*this outputs that they still owe money, and gives that amount in a 
        negative value*/
        if (cost > paid){
        System.out.println("Not enough money.");
        }
        else {
        cost = paid;
        System.out.print("Thank you!\n");
        }
    }
}
