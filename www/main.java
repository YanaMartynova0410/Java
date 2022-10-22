package main.Lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        Integer[] testArr1 = {1, 2, 3, 4};
        System.out.print("Последовательный массива:");
        System.out.println(Arrays.toString(testArr1));
        SwapTwoArrayElements(testArr1, 1, 2);
        System.out.print("Массив с перестановкой элементов:");
        System.out.println(Arrays.toString(testArr1));

        Box box1 = new Box();

        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        System.out.println("Вес коробки 1: " + box1.getWeight());

        Box box2 = new Box();

        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println("Вес коробки 2: " + box2.getWeight());

        System.out.println("Масса коробок " + (box1.compare(box2) ? "одинаковая" : "различна") + ".");

        System.out.println("В коробке 1 хранится " + box1.getProduct().get(0).getClass().getSimpleName());

        Box box3 = new Box();

        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());

        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("В коробке 3 хранится " + box3.getProduct().get(0).getClass().getSimpleName());

        box1.shiftSingleItem(box3);

        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("Вес коробки 1: " + box1.getWeight());

        try {
            box2.shiftSingleItem(box3);
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("Вес коробки 2: " + box2.getWeight());

        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки 3: " + box3.getWeight());

    }

    public static <T> void SwapTwoArrayElements(T[] modifiableArray, int elemNum1, int elemNum2) {
        T backupElement = modifiableArray[elemNum1];
        modifiableArray[elemNum1] = modifiableArray[elemNum2];
        modifiableArray[elemNum2] = backupElement;
    }
}