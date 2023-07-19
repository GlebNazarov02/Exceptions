public class Task2 {
    public static void main(String[] args) {
        correctCode();
    }

    private static void correctCode() {
        try {
             int d = 0;  
            int[] intArray = { 2, 3, 4, 5, 6, 7 };
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}