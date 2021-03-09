package com.company;

public class Main {

    public static void main(String[] args) {//времени,чтобы ломать голову с гитом нет, заливаю сюда по старинке

        int[] array = { 1, 3, 4,1,1,1,2,3,4,5,8 };

        int arrayLength = array.length;

        UniqueArrayNumb(array, arrayLength);

    }
    public static void UniqueArrayNumb(int[] arr, int n) {//хехе , наконец все методизировано

        // Перебор циклом в цикле
        for (int i = 0; i < n; i++) {

            // Проверка на то, если число уже было в массиве
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // Вывод
            if (i == j){
                System.out.print(arr[i] + " ");}
        }
    }
}
