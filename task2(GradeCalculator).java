import java.util.Scanner;

class Range{
    public int Generate(int maximum,  int minimum){
        return (int) (Math.random()*(maximum - minimum + 1) + minimum);
    }
}

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Range rg = new Range();
        int TotalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.println("Enter The Maximum Number:");
            int maximum = s.nextInt();
            System.out.println("Enter The Minimum Number:");
            int minimum = s.nextInt();
            s.nextLine();

            int cnum = rg.Generate(maximum, minimum);
            int attempts = 0;

            while (true) {
                System.out.println("Guess A Number Between " +maximum+ " and " +minimum);
                int gnum = s.nextInt();
                attempts++;

                if (gnum > cnum) {
                    System.out.println("It is Greater");
                } else if (gnum < cnum){
                    System.out.println("It is Lower");
                }else{
                    System.out.println( " Wow..!! Correct Guess!!");
                    win++;
                    break;
                }
            }
            TotalAttempts +=attempts;
            System.out.println("Attempts = " + attempts);
            System.out.println("Wins = " + win);

            double winrate = (double) win / TotalAttempts * 100;
            System.out.printf("Your Winrate is %.2f%%\n",winrate);

            System.out.println("Do you want to play again yes/no");
            String playAgain = s.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                s.close();
                System.exit(0);
            }
            s.nextLine();
        }
    }
}
