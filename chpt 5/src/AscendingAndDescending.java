import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String[] args){
        int userA;
        int userB;
        int userC;
        String result = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ascending and Descending numbers game.");
        System.out.println("Enter a whole number>>>");
        userA= input.nextInt();
        System.out.println("Enter a whole number>>>>");
        userB = input.nextInt();
        System.out.println("Enter a whole number>>>");
        userC = input.nextInt();

        if (userA> userB && userA> userC) {
            if (userB > userC) {
                result = userA + " " + userB + " " + userC;
            } else
                result = userA + " " + userC + " " + userB;
        }
        else if(userB> userA && userB > userC){
            if(userA > userC){

            }

        }



    }
}
