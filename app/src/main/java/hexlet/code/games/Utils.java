package hexlet.code.games;

public class Utils {

    public static  int generateNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
