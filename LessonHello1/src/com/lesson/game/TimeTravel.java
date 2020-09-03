package com.lesson.game;
import java.util.Scanner;

public class TimeTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] sports = {"ICC World Cup", "Olympics", "Ice Hockey World Championships", "FIFA World Cup","UCI World Championship", "Ryder Cup"};
        String [] history = {"World War I", "World War II", "Indo-China War", "Pulwama Attack", "26/11 Mumbai Attack","The American Revolution", "Tearing Down of Berlin Wall"};
        String [] inventions = {"Printing Press", "Light Bulb", " Computer", "Vaccines", "Clock","Automobile","Aeroplane","Telephone"};
        for (int i = 1; i< 5; i++){
            //int year = (int)((Math.random()*81)+1920);
            System.out.println("Events took place in Year " + (int)((Math.random()*81)+1920 ));
            System.out.println("Sport Events: "+ sports[(int)(Math.random()*sports.length)]);
            System.out.println("Historical Events: " + history[(int)(Math.random()*history.length)]);
            System.out.println("Scientific Inventions: "+ inventions[(int)(Math.random()*inventions.length)]);
            System.out.println();
            System.out.println();

        }

    }
}

