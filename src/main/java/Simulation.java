import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Simulation {
    static Integer numberOfRolls = 1000000;


    public static void main(String[] args) {

    }

    public int[] diceSim() {
        int[] arr = new int[13];
        new Dice();
        for (int i = 0; i < numberOfRolls - 1; ++i) {
            arr[Dice.rollDice()]++;
        }
        return arr;
    }

    @Test
    public void printHistogram() {
        int[] dataset = diceSim();
        for (int i = 2; i < 13; ++i) {
            Float decimal = (float)dataset[i]/numberOfRolls;
            Double percent = Math.floor(decimal*100);

            System.out.printf("%2s :%9s:%5.2f " + printStars(percent) + "\n", i, dataset[i], decimal);

        }
    }

    public String printStars(Double numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            sb.append("*");
        } return sb.toString();
    }
}


/*
         2 :    27917: 0.03 **
         3 :    55422: 0.06 *****
         4 :    83457: 0.08 ********
         5 :   110961: 0.11 ***********
         6 :   139098: 0.14 *************
         7 :   166977: 0.17 ****************
         8 :   138386: 0.14 *************
         9 :   111102: 0.11 ***********
        10 :    83367: 0.08 ********
        11 :    55799: 0.06 *****
        12 :    27514: 0.03 **


 */