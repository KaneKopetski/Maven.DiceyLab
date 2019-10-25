import org.junit.jupiter.api.Test;

public class Simulation {
    static Integer numberOfRolls = 100000;
    int numberOfDice = 5;


    public int[] diceSim() {
        Bins bin = new Bins(numberOfDice);
        int[] arr = bin.getBin();

        for (int i = 0; i < numberOfRolls; i++) {
            Integer rollTotal = 0;
            for (int j = 0; j < numberOfDice; ++j) {
                    new Dice();
                    rollTotal += Dice.rollDie();
            }
            arr[rollTotal]++;
        } return arr;
    }

    @Test
    public void printHistogram() {
        int[] dataset = diceSim();

        for (int i = numberOfDice; i < dataset.length; ++i) {
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