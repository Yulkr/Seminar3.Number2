package Nomer2;
/* Реализовать метод, который добавляет 1 000 000 случайных элементов в ArrayList и
LinkedList. Реализовать второй метод, который выбирает из списка элемент наугад 100 000
раз. Замерьте время и скажите кто быстрее.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class Nomer2 {
    public static void compare2Lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        int A = 1000000;
        int L = 100000;
        for (int i = 0; i < A; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        //Замер времени с помощью метода .currentTimeMillis()
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < L; i++) {
            arrayList.get((int) (Math.random() * (A - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < L; i++) {
            linkedList.get((int) (Math.random() * (A - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
