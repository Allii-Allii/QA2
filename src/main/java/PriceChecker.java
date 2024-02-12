public class Task3 {
    public static void main(String[] args) {
        boolean isValidPrice = checkPrice(4, 3);

        if (isValidPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    private static boolean checkPrice(int number1, int number2) {
        if (number1 > number2) {
            return true;
        } else {
            return false;
        }
    }
}
