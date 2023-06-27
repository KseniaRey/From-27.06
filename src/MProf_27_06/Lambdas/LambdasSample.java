package MProf_27_06.Lambdas;

public class LambdasSample {
        public static void main(String[] args) {
            m1((q) -> { //  m1((q) -> это ПАРАМЕТР, мы его просто так называем, просто буквенное обозначение параметра.
                System.out.println("***");
                System.out.println("&&&");
                System.out.println(q);
            }); // в m1() сразу обращаемся к сигнатуре абстрактного метода
        }
        public static void m1(Inter inter){ // передаем экз интерфейса интер
            System.out.println("@@@");
            inter.get("string1");
        }

    @FunctionalInterface
    interface Inter { // может быть только 1 абстрактный метод
        void get(String s);

    }
}
