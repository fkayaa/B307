package d12loopsarrays;

public class ForLoops07 {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outerLoop; //Dış döngünün başına döner
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
