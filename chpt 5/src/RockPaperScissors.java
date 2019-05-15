import java.util.Scanner;
public class RockPaperScissors {

    public static void main(String[] args){
        int user=0;
        String result = null;
        Scanner input = new Scanner(System.in);
        int winTotal=0;
        int loseTotal=0;
        int tieTotal= 0;
        int totalGamesPlayed= -1;

        int random = (int) (Math.random() * 3 + 1);
        while(user !=999)
        {

            System.out.print("Enter a whole number>>>>");
            System.out.print("1) For Rock");
            System.out.print("2) For Paper");
            System.out.print("3) For Scissors");
            user = input.nextInt();
        }
        if(user == 1) {
            if (random == 1)
                result = "Tie";
            tieTotal++;
            {

            }
             if (random == 2) {
                result = "Lose";
                loseTotal = loseTotal +1;}
            else
                result = "Win";
                winTotal = winTotal +1;
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
        System.out.println("Thanks for playing");
        System.out.println("Win total equals" + winTotal + "Lose total equal"+
        loseTotal + "\nTie total equals"+ tieTotal + "\n Total games plaeyd" + totalGamesPlayed);

        System.out.println("**************Display Graph***************");
        System.out.print("W"); displayBar(winTotal);
        System.out.print("L"); displayBar(loseTotal);
        System.out.print("T"); displayBar(tieTotal);
    }
     public static void displayBar(int b){
        for(int i = 0; i < b; ++i){
            System.out.print("#");
        }
        System.out.println();

     }


}
