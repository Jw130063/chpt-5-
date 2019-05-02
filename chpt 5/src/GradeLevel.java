import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String year;
        String result;
        System.out.println("Please enter what year you are in highschool");
        year = input.next();

        switch (year) {
            case "freshman":
                result = "You are a first year student.";
                break;
            case "Sophmore":
                result = "You are a second year student";
                break;
            default:
                result = "Invalid Student";
            case "Junior":
                result = "You are a third year student";
                break;


        }


    }
    public static void aDiffrentCaseBreak(){

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter what year you are in highschool");
        int num = input.nextInt();


    }
}