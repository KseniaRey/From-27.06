package MProf_27_06.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(123);
        list.add(122);
        list.add(152);
        list.add(112);
        list.add(120);
        list.add(16);

        list.stream() // создать стрим
                .filter(el -> { // intermediate operator
                    System.out.println("@@@@@@@");
                    return el % 2 == 0;
                }).collect(Collectors.toList()); // collect - terminal operator
        // ВАЖНО! Без терминального оператора стрим НЕ БУДЕТ ВЫПОЛНЯТЬСЯ
    }
}
