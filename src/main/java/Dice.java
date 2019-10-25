import java.util.ArrayList;

public class Dice {

    public Dice() {
    }
/*
    public static Integer rollDice() {
        Integer die1RollValue;
        Integer die2RollValue;

        die1RollValue = (int)(Math.random()*((6 - 1) + 1)) + 1;
        die2RollValue = (int)(Math.random()*((6 - 1) + 1)) + 1;

        return die1RollValue + die2RollValue;
    }
    */


    public static Integer rollDie() {
        Integer dieRollValue;
        dieRollValue = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        return dieRollValue;

    }

/*
    public static Integer rollNDice(Integer numberOfDice) {
        Integer dieRollValue = 0;
        for (int i = 0; i < numberOfDice; i++) {

            dieRollValue += (int)(Math.random()*((6 - 1) + 1)) + 1;
        }
        return dieRollValue;
}


 */


}












/*public class Dice {


public Dice(Integer numberOfDice) {
    this.Dice =
}

    public static Integer rollDice(Integer numberOfDice) {
        Integer max = 6 * numberOfDice;
        Integer min = numberOfDice;
        Integer range = max - numberOfDice + 1;

        Integer rollTotal = (int)(Math.random() * range) + min;
        return rollTotal;
    }


}
*/