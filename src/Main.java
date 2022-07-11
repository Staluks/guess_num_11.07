<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
=======
import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
//      uzminamais skaitlis
        int answerNum = rand.nextInt(10);
//      minējumu skaits
        int guesses = 0;
//      maksimālais minējumu skaits
        int maxGuesses =3;
        System.out.println("Guess the number!(1-10):");

        while (guesses < maxGuesses) {
            System.out.println("Your guess:");
            int guessNum = scan.nextInt();
//          kas notiek ja nepareizi ievada skaitli kurš nav norādītajā intervālā.
            if (guessNum > 10 || guessNum < 1) {
                System.out.println("Wrong input");
            }
//          kas notiek pēc nepareiza minējuma.
            else if (guessNum != answerNum + 1) {
                System.out.println("WRONG!");
                guesses ++;
//              kas notiek pēc trīs nepareiziem minējumiem.
                if (guesses == maxGuesses) {
                    System.out.println("You lost! Number was " + (answerNum + 1) + ".");

                }
            }
//          kas notiek pēc pareiza minējuma.
            else if (guessNum == answerNum + 1) {
                System.out.println("!!!YOU WON!!!");
                break;

            }

        }

>>>>>>> 4fa20a9 (Initial commit)
    }
}