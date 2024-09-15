import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Double[] m = new Double[10];
        for (int i = 0; i < 10; i++)
        {
            m[i] = Math.random();
        }
        System.out.println("Случайный массив с помощью Math.random:");
        printArray(m);
        Arrays.sort(m);
        System.out.println("Отсортированный массив:");
        printArray(m);

        Random rand = new Random();
        for (int i = 0; i < 10; i++)
        {
            m[i] = rand.nextDouble();
        }
        System.out.println("Случайный массив с помощью класса Random:");
        printArray(m);
        Arrays.sort(m);
        System.out.println("Отсортированный массив:");
        printArray(m);

        Scanner sc = new Scanner(System.in);
        System.out.println("Преобразование из String в Double:");
        System.out.println("Введите число:");
        while (sc.hasNext())
        {
            System.out.printf("%.3f\n", Double.parseDouble(sc.nextLine()));
            System.out.println("Введите число:");
        }
    }

    private static void printArray(Double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%.3f ", array[i]);
        }
        System.out.print("\n");
    }
}