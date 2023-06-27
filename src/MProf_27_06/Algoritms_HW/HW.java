package MProf_27_06.Algoritms_HW;

public class HW {

        public static int findKthElement(int[] arr1, int[] arr2, int k) {
            int m = arr1.length;
            int n = arr2.length;
            int i = 0, j = 0;

            while (i < m && j < n) {
                if (arr1[i] <= arr2[j]) {
                    if (k == 1) {
                        return arr1[i];
                    }
                    i++;
                } else {
                    if (k == 1) {
                        return arr2[j];
                    }
                    j++;
                }
                k--;
            }

            while (i < m) {
                if (k == 1) {
                    return arr1[i];
                }
                i++;
                k--;
            }

            while (j < n) {
                if (k == 1) {
                    return arr2[j];
                }
                j++;
                k--;
            }

            return -1; // Если k превышает размер обоих массивов
        }

        public static void main(String[] args) {
            int[] arr1 = {100, 112, 256, 349, 770};
            int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
            int k = 7;
            int result = findKthElement(arr1, arr2, k);
            System.out.println("Результат: " + result);
        }


}
