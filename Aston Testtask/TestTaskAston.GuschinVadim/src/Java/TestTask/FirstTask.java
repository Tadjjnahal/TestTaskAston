package TestTask;

import java.io.IOException;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        char a;
        System.out.print("Введите число: ");
        a = (char) System.in.read();
        if (a > '7') {
            System.out.println("Привет");
        } else if (a <= '7') {
            System.out.println("Введите число побольше");
        }


    }
}
