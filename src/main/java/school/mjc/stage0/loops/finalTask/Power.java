package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int formula = (int) Math.pow(numberToPrint, power);
        System.out.println(formula);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
