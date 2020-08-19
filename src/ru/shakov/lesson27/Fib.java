package ru.shakov.lesson27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Fib {

    // Ряд Фибоначчи: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 и т. д.
    static int fib(int n) {
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();

        Stack stack = new Stack();
        for (int j = 1; j <= n; j++) {
            stack.push(fib(j));
        }

        Stack stack1 = new Stack();
        while (!stack.isEmpty()) {
            stack1.push(stack.peek());
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        while (!stack1.isEmpty()) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();

        List<Integer> arrayList = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            if (k == 0) arrayList.add(k, 0);
            else if (k == 1) arrayList.add(k, 1);
            else arrayList.add(k, arrayList.get(k - 2) + arrayList.get(k - 1));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
