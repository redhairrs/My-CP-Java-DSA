package com.Rishabh;
import java.util.Scanner;
public class HowToUseVariableInDifferentClass {
    public static void main (String[] args) {

        Playeri user = new Playeri();

        Scanner input = new Scanner(System.in);

        user.name = input.nextLine();

        user.showName();


    }

}

class Playeri {

    String name;

    void showName() {

        System.out.println("Your name is " + name + ".");
    }

}
