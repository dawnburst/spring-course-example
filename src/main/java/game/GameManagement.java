package game;

import lombok.Data;

import java.util.Random;

@Data
public class GameManagement {

    private int numberOfTries;
    private GameRunner gameRunner;
    private int randomNum;

    private void randomNumber(){
        Random random = new Random();
        this.randomNum = random.nextInt(11); //Random number from 0 to 10
    }

    public void printNumOfGuesses (){
        System.out.println("Hello Friend! \n" +
                "Please take a guess of a number 0 - 10\n" +
                "You have " + numberOfTries + " tries to guess the number\n");
    }

    public void runGame(){
        randomNumber();
        int triesLeft = numberOfTries;
        while (triesLeft-- > 0){
            if (gameRunner.takeAGuess() == randomNum) {
                System.out.println("Right guess!!");
                break;
            }
            else{
                if (triesLeft == 0) {
                    System.out.println("You did not guessed the right number :(");
                }
                else{
                    System.out.println("Wrong guess, Try again ("+ triesLeft + "/" + numberOfTries +" tries left)");
                }
            }
        }
    }

}
