package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
    // Задача 3: Работа с числами
        List<Integer> inList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> outList = new ArrayList<>();

        for (Integer element: inList) {
            if (element > 0 && element % 2 == 0) {
                outList.add(element);
            }
        }

        outList.sort(Comparator.naturalOrder());

        for (Integer element: outList) {
            System.out.println(element);
        }
    }
}

