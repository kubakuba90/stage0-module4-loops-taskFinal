package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {

        int rows = cathetusLength;

        for (int i=1; i <= rows; i++) {
            for(int j=1; j <= rows; j++)
                if(j < i)
                    System.out.print(" "); // space
                else
                    System.out.print("*"); // star
            // new line
            System.out.println();
        }



    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
