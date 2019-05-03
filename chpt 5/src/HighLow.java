import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {

        int userGuess = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my game.");
        System.out.println("Pick a number between 1 to 10.");
        System.out.println("Guess correctly win a prize.");
        System.out.print("Pick a number >>>>>.");
        userGuess = input.nextInt();


        int random = (int) (Math.random() * 10 + 1);

        if (userGuess == random) {

            System.out.println("Guessed Correctly!!! Connor has your pirze out back");

        }
        else if (userGuess > random)
        {
            System.out.println("Wrong number it was to high" + random);
    }
        else if (userGuess < random)
        {
            System.out.println("Wrong number it was to low" + random);
    }
        else {

            System.out.println("That number was outside the range of 1-10");
        }





    }


}
