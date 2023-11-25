package org.example.basic;

import java.util.ArrayList;
import java.util.List;

public class OperatingAnArray {

    static List<Integer> a = new ArrayList<>();
    public static void main(String[] args) {
        a.add(2);
        a.add(4);
        a.add(1);
        a.add(0);
        a.add(2);

        System.out.println(searchEle(a, 1));
        System.out.println(insertEle(a, 2,2));
        System.out.println(deleteEle(a, 2));

        for (int e:a) {
            System.out.print(e + " ");
        }
    }

    static boolean searchEle(List<Integer> a, int x) {
        if (a.contains(x))
            return true;
        return false;
    }

    static boolean insertEle(List<Integer> a, int y, int yi) {
        if(yi >= 0 && yi < a.size()) {
            a.add(yi, y);
            return true;
        }
        return false;
    }

    static boolean deleteEle(List<Integer> a, int z) {
        if (!a.contains(z))
            return false;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == z) {
                a.remove(a.get(i));
                break;
            }
        }
        return true;
    }
}
