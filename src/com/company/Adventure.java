package com.company;

import java.util.Scanner;

public class Adventure {


    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);

        String Go, look, pantry, eat;

        System.out.println(" WELCOME TO Ujwal TINY ADVENTURE");
        System.out.println("  ");
        System.out.println(" You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'? ");
        System.out.print(" > ");
        Go = keyboard.next();

        if (Go.equals("kitchen")) {
            System.out.println("There is a long counter stop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in the 'pantry'. ");

        }
        System.out.print(">  ");
        look = keyboard.next();


        if (look.equals("refrigerator"))  {
            System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");
        }
        System.out.print(">  ");
        eat = keyboard.next();

        if (eat.equals("Yes")) {
            System.out.println("  ");
            System.out.println("You live!");
        } else if (eat.equals("No")) {
            System.out.println("  ");
            System.out.println("You die of starvation!");

        } else if (eat.equals("pantry")) {
            System.out.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");
        }
        System.out.print(">  ");
        pantry = keyboard.next();

        if (pantry.equals("fight")) {
            System.out.println("  ");
            System.out.println("You're weak and die");
        } else if (pantry.equals("run away")) {
            System.out.println("  ");
            System.out.println("You died because your too slow & can't run");

        }

        else if (Go.equals("upstairs")) {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master 'bedroom' There is also 'bathroom' off the hallway. where would you like to go ?");
        }
        System.out.print(">  ");
        look = keyboard.next();


        if (look.equals("bedroom")) {
            System.out.println("You are in plush bedroom, with expensive-looking hardwood furniture. The bed id unmande. In the back of the room, the closet door is ajar. Would you like to open the door ? ('yes' or 'no')");
        }
        System.out.print(">  ");
        eat = keyboard.next();

        if (eat.equals("no")) {
            System.out.println("  ");
            System.out.println("Well then you will never know what was there! Thanks for playing I'm tired of making nested if statements.");
        } else if (eat.equals("yes")) {
            System.out.println("  ");
            System.out.println("You die  HaHa !");

        }
    }

}



