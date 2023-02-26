import java.util.Scanner;
public class CtoF {
        public static void main(String[] args) {
            double fahrenheit;
            double celsius;
            boolean done=false;
            String trash;

            Scanner in = new Scanner(System.in);
            do
            {
                System.out.print("Enter temperature in Fahrenheits: "); //input

                if (in.hasNextDouble())
                {
                    done = true;
                    fahrenheit = in.nextDouble();
                    in.nextLine(); //clear buffer
                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println("The temperature in Celsius is " + celsius);

                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("Must enter a valid temperature in Fahrenheits " + trash); //for invalid input
                }
            }
            while (!done);



    }
}
