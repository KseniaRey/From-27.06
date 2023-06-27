package MProf_27_06.Lambdas;

public class Task1 {
    /*Написать 2 класса
    * 1. Функц интре
    * 2. мейн
    * 3. м1 - метод, принимающий массив
    * 4. в мейне через лямбду цикл*/
    public static void main(String[] args) {
        m3(array -> { // этот аррей - просто имя, можем назвать хоть Х, мы должны придумать какой-то идентификатор
            int sum = 0;
            for (int j : array) {
                sum += j;
            }
            System.out.println(sum);
        });
    }
    public static void m3(Arr arr){
        arr.get(new int[] {1, 3, 4, 6});
    }
    @FunctionalInterface
    interface Arr{
        void get(int[] arr);
    }
}


