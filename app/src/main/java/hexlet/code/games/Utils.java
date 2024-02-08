package hexlet.code.games;

public class Utils {
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static int generateRandomOperator() {
        return (int) (Math.random() * 3);
    }
}

