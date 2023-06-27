package MProf_27_06.Algoritms_HW;

public class HW_2 {

        public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
            if (low > high) {
                return -1; // Элемент не найден
            }

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // Элемент найден
            } else if (arr[mid] > target) {
                return binarySearchRecursive(arr, target, low, mid - 1); // Искать в левой половине
            } else {
                return binarySearchRecursive(arr, target, mid + 1, high); // Искать в правой половине
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 4, 7, 9, 12, 15, 18, 22};
            int target = 9;
            int result = binarySearchRecursive(arr, target, 0, arr.length - 1);
            if (result != -1) {
                System.out.println("Элемент " + target + " найден в позиции " + result);
            } else {
                System.out.println("Элемент " + target + " не найден в массиве.");
            }
        }


}
