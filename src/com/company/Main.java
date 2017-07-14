package com.company;
 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize Variables

        Scanner scan = new Scanner(System.in);
        System.out.print("Please ask for userName");
        String userName = "";
        userName = scan.next();

        //Get Users First Name

        System.out.println("Hello " + userName + "!" + " How Are You Today? ");
        String answer = "yes";

	/* write your code here */



        do {

            System.out.print(userName + "," + " Please enter integer between 1 and 100: ");
            int userInput = scan.nextInt();
            scan.nextLine();//clear the leftover Enter


            if (userInput % 2 != 0 && userInput < 60) {
                System.out.println(userInput + "  " + "Odd");

            } else if (userInput % 2 == 0 && userInput <= 25 && userInput < 2) {
                System.out.println(userInput + "  " + "Even and less than 25");

            } else if (userInput % 2 == 0 && userInput > 26 && userInput < 60) {
                System.out.println(userInput + "Even");

            } else if (userInput % 2 == 0 && userInput >= 60) {
                System.out.println(userInput + "  " + "Even");

            } else if (userInput % 2 != 0 && userInput >= 60)
            {
                System.out.println(userInput + "  " + "Odd");

            }

            System.out.println("Press yes to continue");
            answer = scan.nextLine();

        } while (answer.equals("yes")) ;

        System.out.println("Bye and Have A Nice Day ");




    }
}