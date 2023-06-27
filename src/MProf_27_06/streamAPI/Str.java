package MProf_27_06.streamAPI;

import java.util.Arrays;

public class Str {
    private static int getL (String s){
        return s.length();
    }
    private static String getS (int a){
        return String.valueOf(a); // передаем стринг превращается в инт
    }
    public static void main(String[] args) { // без стримов
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.println(arr[i] * 10);
            }
        }

        int[] dd = Arrays.stream(arr) // обращаемся к массивам и создаем поток, с кот будем работать - 1, 2, 3, 4, 5, 6
                .filter(elem -> elem % 2 == 0)// вызывает функц интерфейс predicate с булевым методом test -- тут отфильтруются только четные - 2, 4, 6
                .map(elem -> elem * 10) // принимает функц интер "Унарный опрератор" с методом applyAsInt - принимает какой-то тип данных и возвращает такой же тип данных - 20, 40, 60
                .sorted() // сортируется по возрастанию
                .distinct() // вернет только уникальные элементы
//                .forEach(System.out::println);
                .toArray(); // терминальный оператор
        // стрим не меняет коллекции, просто берет оттуда данные и использует их
    }
}
