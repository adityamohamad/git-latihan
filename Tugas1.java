public class Tugas1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0); // throw Exception
        } catch (ArithmeticException e) {
            // Exception handler
            System.out.println("Divided by zero operation cannot possible");
        }
        System.out.println(3 / 1);
    }
}