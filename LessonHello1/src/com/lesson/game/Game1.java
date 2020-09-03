package com.lesson.game;
import java.util.Scanner;
public class Game1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scan.nextLine();
        int userCount = 0;
        int compCount = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("1. Stone \n 2. Scissor \n 3. Bag  \n Enter the choice:");
            int userChoice = scan.nextInt();

            // double x = Math.random()*3;
            //System.out.println(x);

            int comp = (int) ((Math.random() * 3) + 1);


            System.out.println("Computer choice is :" + comp);

            switch (userChoice) {
                case 1 :

                    break;
                case 2 :
            }

            if (userChoice == 1 && comp == 2) {

                userCount += 1;
            } else if (userChoice == 2 && comp == 1) {
                System.out.println("Winner: Computer.");
                compCount +=1;
            } else if (userChoice == 1 && comp == 3) {
                System.out.println("Winner: Computer.");
                compCount +=1;
            } else if (userChoice == 3 && comp == 1) {
                System.out.println("Winner: " + name);
                userCount += 1;
            } else if (userChoice == 2 && comp == 3) {
                System.out.println("Winner: " + name);
                userCount += 1;
            } else if (userChoice == 3 && comp == 2) {
                System.out.println("Winner: Computer.");
                compCount +=1;
            } else
                System.out.println("Its a draw.");
        }
        System.out.println("Your Score is :" + userCount);
        System.out.println("Computer Score is :"+ compCount);

        if (userCount>compCount)
            System.out.println("Final Winner is : "+ name);
        else if (userCount==compCount)
            System.out.println("Its a Draw, Play Again..");
        else
            System.out.println("Final Winner is : Computer");
    }
    }

