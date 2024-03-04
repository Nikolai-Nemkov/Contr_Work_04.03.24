package View;

import java.util.Scanner;
import java.util.function.Function;

public class UI {

    Scanner in = new Scanner(System.in, "cp866");


    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };

    /**
     * Метод выбора операции
     * @return - номер операции
     */
    public int getChoice() {
        System.out.println("Выберите номер операции и получите ответ: ");
        System.out.println("\t1. + ");
        System.out.println("\t2. - ");
        System.out.println("\t3. * ");
        System.out.println("\t4. / ");
        return in.nextInt();
    }
}