package MProf_27_06.Lambdas;

public class Task1_2 {
    public static void main(String[] args) {
        m3(Task1_2::sumArr);
    }
    public static void sumArr (int [] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }

    public static void m3(Arr arr){
        arr.get(new int[] {1, 3, 4, 6}); // инициализация массива
    }
    @FunctionalInterface
    interface Arr{
        void get(int[] arr);
    }
}
