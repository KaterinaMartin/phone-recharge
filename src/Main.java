public class Main {
    public static void main(String[] args) {
        int balance = 120;
        int payment = 1560;
        int bonus = payment / 100 + payment;
        if (payment > 1000) {
            payment = bonus;
        } else {
            payment = payment;
        }
        int total = balance + payment;

        System.out.println("Итоговый счет: " + total);
    }
}