public class Main {


    public static void main(String[] args) {
        checkText("lottery", "test");
    }

    private static void checkText(String text, String text2) {
        if (text.equals(text2)) {
            System.out.println("Вие печелите голяма награда");
        } else {
            System.out.println("Опитай пак");
        }
    }
}