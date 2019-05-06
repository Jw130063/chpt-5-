import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args){
        int user;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole numbe>>>>");
        System.out.print("1) For Rock");
        System.out.print("2) For Paper");
        System.out.print("3) For Scissors");
        user = input.nextInt();

        int random = (int) (Math.random() * 3 + 1);

        if(user == 1) {
            if (random == 1)
                result = "Tie";
            else if (random == 2)
                result = "Lose";
            else
                result = "Win";
        }

        if(user == 2){
           if (random == 2)
               result = "Tie";
           else if (random == 3)
               result = "lose";
           else
               result = "Win";
        }

        if(user == 3){
            if (random == 3)
                result = "Tie";
            else if (random==1)
                result = "lose";
            else
                result = "Win";

        }
        System.out.println(result);
    }



}
