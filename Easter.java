//***************************************
//Tyler Burse - tjb2147
//Project 1 - P4.2
//COMS W1004
//Professor Cannon
//***************************************

import java.util.Scanner;

public class Easter
{
    public static void main (String[]args)
    {
        /* this asks the user to input what year they want to find the date 
        of easter*/
        Scanner in = new Scanner (System.in);
        System.out.print("This will tell you what day Easter will be.\n" + 
                         "Enter year:");
        int year = in.nextInt();
      
        /*this is the algorithm from the Big Java book that evaluates what 
        day Easter will fall on*/
        int a = year % 19;
        int b = year /100;
        int c = year %100;
        int d = b/4;
        int e = b%4;
        int g = (8*b+13)/25;
        int h = (19 * a+b-d-g+15)%30;
        int j = c/4;
        int k = c% 4;
        int m = (a+11*h)/319;
        int r = (2*e+2*j-k-h+m+32)%7;
        int n = (h-m+r+90)/25;
        int p = (h-m+r+n+19)%32;
        
        /* this assigns a the number of the month to the written month, then 
        outputs it so it is easier to read as the user*/        
        String month = "";  
        
        if (n == 1){
            month = "January";
        }
        else if (n == 2){
            month = "February";
        }
        else if (n == 3){
            month = "March";
        }
        else if (n == 4){
            month = "April";
        }
        else if (n == 5){
            month = "May";
        }
        System.out.println("Easter will be on: " + month + " " + p + " in the year " 
                            + year);
     }
}
