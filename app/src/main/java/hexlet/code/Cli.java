package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void getName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
    }
}

