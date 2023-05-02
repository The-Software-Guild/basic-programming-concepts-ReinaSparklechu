import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int dollars = 0;
        int rolls = 0;
        int highest = 0;
        int highestRolls = 0;
        System.out.printf("How many dollars do you have? ");
        dollars = scanner.nextInt();
        System.out.println();
        while(dollars >0){
            if((random.nextInt(6)+1)+ (random.nextInt(6)+1) == 7) dollars += 4;
            else dollars -=1;
            rolls++;
            if(dollars > highest){
                highest = dollars;
                highestRolls = rolls;
            }
        }
        System.out.printf("You are broke after %d rolls\n", rolls);
        System.out.printf("Should have quit after %d rolls when you had %d\n", highestRolls, highest);
    }
}
