package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void getName() {
        Scanner scan = new Scanner(System.in);
        int gameNumber = scan.nextInt();
        System.out.println("Your choice: " + gameNumber);
    }
}

