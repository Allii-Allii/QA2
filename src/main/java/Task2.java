public class Task2 {
    public static void main(String[] args) {
        calculateCreditDetails("Alina", 27, 2000, 24);
        calculateCreditDetails("Alex", 17, 3000, 10);
    }

    public static void calculateCreditDetails(String name, int age, int amount, int months) {
        if (age < 18) {
            System.out.println("Трябва да имате навършени 18 години, за да изтеглите кредит");
        } else {
            if (amount < 1000) {
                if (months > 12) {
                    System.out.println("Не можете да изтеглите сума под 1000 лв  за период по дълъг от 12 мес");
                } else {
                    double monthlyPayment = amount / months;
                    System.out.println("Месечна вноска е равна на" + monthlyPayment);
                }
            } else {
                double interestRate = getInterestRate(amount);
                double totalAmount = amount + (amount * interestRate * months / 12);
                double monthlyPayment = totalAmount / months;
                System.out.printf("Месечна вноска за сума от %d лева за %d месеца с лихва %.2f%%  %.2f лв %n", amount, months, interestRate * 100, monthlyPayment);
            }
        }
    }

    private static double getInterestRate(int amount) {
        if (amount <= 5000) {
            return 0.05; // 5% лихва за суми до 5 хил. лв
        } else if (amount <= 10000) {
            return 0.04; // 4% лихва за суми до 10 хил. лв
        } else {
            return 0.03;

        }
    }
}
