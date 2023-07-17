// Press Shift twice to opgien the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int score = 100;
        int replenish = 1100;
        int bonus = 0;
        if (replenish > 1000) {
            bonus = replenish / 100;
        }
        int finalScore = score + replenish + bonus;
        System.out.println("Итоговый счет = " + finalScore);

    }
}