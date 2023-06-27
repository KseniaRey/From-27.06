package MProf_27_06.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(31);
        list.add(13);
        list.add(32);
        list.add(43);

//        list // создаем стрим для листа -> было list.stream(), но среда предложила сделать так, как сейчас
//                .forEach(System.out::println);

        int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Arrays.stream(arr) // создаем стрим из массива
//                .forEach(System.out::println);

        // создаем новый стрим типа интеджер
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
//        stream.forEach(System.out::println);
        System.out.println(stream.count()); // count - количество эл в стриме
        System.out.println(stream.distinct().count()); // оставить уникальные эл и посчитать их количество

        // ВАЖНО - стримы нельзя переиспользовать. если мы используем стри 1 раз, то второй раз его нельзя переиспользовать - ошибка IllegalStateException : stream has already been operated upon or closed
    }
}
