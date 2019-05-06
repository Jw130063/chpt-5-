import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        int choice;

        System.out.println("What type of triangle are you solving for?");
        System.out.println("1. Right triangle");
        System.out.println("2. isoceles");
        System.out.println("3. Equalateral");
        Scanner input = new Scanner(System.in);

        choice = input.nextInt();

        if(choice ==1)
        rightTriangle();

        else if(choice==2)
        isocelesTriangle();

         else if(choice == 3)
         equalateralTriangle();
        else
            triangleDoesNotExsist();
        }
        public static void isocelesTriangle(){
        //triangle with two equal sides always try to find the base and area
            System.out.println("Would you like to solve for base, height, or area?");
            double side;
            double height;
            double area;
            double perimeter;
            String choice;
            Scanner userinput = new Scanner(System.in);


            System.out.println("");


            
        }
        public static void equalateralTriangle(){
        // all sides are equal find the parameter and height
            System.out.println("Would you like to solve for side A, side B, or side C?");
            double perimeter;
            double side;
            double area;
            String choice;
            Scanner userinput = new Scanner(System.in);



        }
        public static void triangleDoesNotExsist(){
            System.out.println("This triangle does not exsist.");
        }







    public static void rightTriangle(){
        Scanner input = new Scanner(System.in);
        double sideA;
        double sideB;
        double sideC;
        String sideChoice;

        System.out.println("What side of the triangle are you trying to solve for? A, B, or C");
        sideChoice =  input.next();

        if(sideChoice.equals("A")) {
            System.out.println("What is side B?>>>");
            sideB = input.nextDouble();
            System.out.println("What is side C?>>>>");
            sideC = input.nextDouble();

        }
        else if (sideChoice.equals("B")){
            System.out.println("What is side A?>>>");
            sideA= input.nextDouble();
            System.out.println("What is side C?>>>");
            sideC= input.nextDouble();


        }
        else if(sideChoice.equals("C")){
            System.out.println("What is side A?>>>");
            sideA= input.nextDouble();
            System.out.println("What is side B?>>>");
            sideB = input.nextDouble();
        }
        else
            System.out.print("That side does not exsist on a triangle dummy!!!");

    }
    public static void calculateSideA(double b, double c, String Choice){
        double a;
        a = Math.sqrt(b*b - c*c);
        System.out.println("The side " + Choice + "=" + a);
        }




}
