package MProf_27_06.Lambdas;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class Sample3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Oksana", "Vladislav", "Vadim");
//        for (String s : list) {
//            System.out.println(s);
//        }
        list.forEach((param) -> out.println(param)); // Принимает в качестве параметра Consumer, кот является функцианальным интерфейсовм с одним методом void accept();, принимающим параметр T t
    // параметр тут может иметь любое значения. В этом примере параметром листа будет стринга

        list.forEach(out::println); // -> та же запись, но в другом виде "печатай каждый элемент из массива лист"
        // такая форма записи потому что System out (класс System с параметром out) - это команда, взаимодействующаяя с методом println

        list.forEach(out::println); // можно и так, но тогда понадобится интеграция вот этого import static java.lang.System.out; (среда сама предложит)

    // Квадраточие (::) это метод-референс, ссылка на метод, в котором уже есть реализация абстрактного метода. А лямбда-выражения
        // это форма записи реализации абстрактного метода.
    }
}
