package MProf_27_06.Vlad_Practice_HashTable;

import java.util.Objects;

public class HashMap {
    Object[] arr = new Object[23];

    public void add (Object key, Object value){
//        System.out.println(hash(key));
//        arr[hash(key)] = value;

        int pos = hash(key); // находим позицию
        int step = hash2(key); // находим смещение
        while (arr[pos] != null){
            System.out.println("Коллизия: ");
            System.out.println(" pos = " + pos + "occupied");
            pos += step; // прибавляем смещение к позиции вставки
            System.out.println(" step = " + step + "move");
            pos %= arr.length; // находим остаток от деления
            System.out.println(" pos = " + pos + "new position");
        }
        arr[pos] = value;
    }

    /**
     * По ключу вычисляет позицию массива и возвращает элемент
     * @param key
     * @return элемент
     */
    public Object getValue(Object key){
        return arr[hash(key)];
    }

    /**
     * Метод для хеширования ключей - определения позиции в массиве для искомого элемента
     * @param key ключ
     * @return позиция в массиве
     */
    public int hash(Object key){
        return key.hashCode() % arr.length; // потому что хеш код выдаст огромное число в качестве индекса, и его нужно вместить в размер массива.

    }
    public void display(){
        System.out.println("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // TODO Рассмотреть возможные индексы для элемента массива
    public int hash2(Object key){       // Берем индекс, который является простым
        return 5 - key.hashCode()% 5; // тут берем 5 потому что нам нужно простое число, которое не делится без остатка на 23, мы гарантируем, что индекс не будет равен 0, чтобы избежать коллизии.
    }
}
