package MProf_27_06.Vlad_Practice_HashTable;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.hashCode());
        HashMap hashMap = new HashMap();
        hashMap.add("Hi", "Привет");

        hashMap.add("Bye", "Пока");
        hashMap.add("Dog", "Собака");
        hashMap.add("Cat", "Кот");
        hashMap.add("Plane", "Самолет");
        hashMap.add("Car", "Машина");
        hashMap.add("Game", "Игра");
        System.out.println(hashMap.getValue("Hi"));
        hashMap.display();
    }
}
