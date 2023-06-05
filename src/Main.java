// Программа для реализации операции вставки в красно-черном дереве.
import java.util.Scanner;

class node {

    node left, right;
    int data;

    // красный ==> true, черный ==> false
    boolean color;

    node(int data) {
        this.data = data;
        left = null;
        right = null;

// Новый узел, который создается, является всегда красного цвета.
        color = true;
    }
}

