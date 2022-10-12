import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        boolean playing = true;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int dice1 = 0;
        int dice2 = 0;

        do {

            dice1 = rnd.nextInt(6) + 1;
            dice2 = rnd.nextInt(6) + 1;
            int sum = dice1 + dice2;

            if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("Your sum is: " + sum + " and you crapped out!");
                boolean done = false;
                do {
                    String answer = "";
                    System.out.println("Do you want to play again? [Y/N]: ");
                    answer = in.nextLine();
                    if (answer.equalsIgnoreCase("Y"))
                    {
                        done = true;
                    }
                    else if (answer.equalsIgnoreCase("N"))
                    {
                        done = true;
                        playing = false;
                    }
                    else
                    {
                        System.out.println("incorect input, try again");
                    }
                }while (!done);
            } else if (sum == 7 || sum == 11){
                System.out.println("You win! With: " + sum);
                boolean done = false;
                do {
                    String answer = "";
                    System.out.println("Do you want to play again? [Y/N]: ");
                    answer = in.nextLine();
                    if (answer.equalsIgnoreCase("Y"))
                    {
                        done = true;
                    }
                    else if (answer.equalsIgnoreCase("N"))
                    {
                        done = true;
                        playing = false;
                    }
                    else
                    {
                        System.out.println("incorect input, try again");
                    }
                }while (!done);
            } else {
                System.out.println("Point: " + sum + " Roll again");
            }

        } while (playing);




    }
}