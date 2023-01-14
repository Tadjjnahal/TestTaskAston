package TestTask;

import java.io.IOException;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        Scanner name = new Scanner(System.in);
        System.out.print("Пожалуйста, введите имя: ");
        String name1 = name.nextLine();
        if (name1.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав!");
        } else if (name1.equals("вячеслав")) {
            System.out.print("Привет, Вячеслав! ");
        } else {
            System.out.print("Нет таких имен");
        }

    }
}
