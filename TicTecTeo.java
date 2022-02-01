package com.Rishabh;
import java.util.*;

public class TicTecTeo {
    public static void main(String[] args) {
        System.out.print("Enter cells:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char [][] array = new char[3][3];
        int xCount = 0;
        int oCount = 0;
        int winnerCount = 0;
        char winner = 'R';
        boolean notFinished = false;


        // Take the input of for the game
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = input.charAt(i * 3 + j); // Important hai bhai!!
                if (array[i][j] == 'X') {
                    xCount++;
                } else if (array[i][j] == 'O') {
                    oCount++;
                } else if (array[i][j] == ' ' || array[i][j] == '_') {
                    notFinished = true;
                }
            }
        }

        // it print's the structure of the our Tic Tec Teo
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");

        //user input for a new move
        boolean badInput = true;
        while(badInput) {
            System.out.println("Enter the coordinates: ");
            String newXinput = sc.next();
            String newYinput = sc.next();
            int newX;
            int newY;
            try {
                newX = Integer.parseInt(newXinput);
                newY = Integer.parseInt(newYinput);
            }
            catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                break;
            }
            if (newX > 3 || newX < 1 || newY > 3 || newY < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (array[newX - 1][newY - 1] == 'X' || array[newX - 1][newY - 1] == 'O') {
                System.out.println("This cell is occupied! Choose another one");
            } else {
                array[newX - 1][newY - 1] = 'X';
                badInput = false;
            }
        }

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("---------");


        // cheak weather you win or loss or draw conditions.
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2]
                || array[2][0] == array[1][1] && array[1][1] == array[0][2]) {
            winner = array[1][1];
            winnerCount++;
        }
        for (int i = 0; i < 3; i++) {
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i]) {
                winner = array[0][i];
                winnerCount++;
            }
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                winner = array[i][0];
                winnerCount++;
            }
        }
        if (Math.abs(xCount - oCount) > 1) {
            System.out.println("Impossible");
            return;
        }
        if (winnerCount == 0) {
            if (xCount + oCount == 9) {
                System.out.print("Draw");
                return;
            } else {
                System.out.print("Game not finished");
            }
        } else if (winnerCount == 1 && (winner == 'X' || winner == 'O')) {
            System.out.println(winner + " wins");
        } else {
            System.out.println("Impossible");
        }
    }
}

