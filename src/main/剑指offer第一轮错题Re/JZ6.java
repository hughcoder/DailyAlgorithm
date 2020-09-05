package main.剑指offer第一轮错题Re;

public class JZ6 {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int m = left + (right - left) / 2;
            if (array[m] < array[right]) {
                right = m;
            } else if (array[m] > array[right]) {
                left = m + 1;
            } else {
                right--;
            }

        }
        return array[right];
    }

    public static void main(String args[]) {
        JZ6 jz6 = new JZ6();
        int[] array = {1, 3, 5};
        System.out.println(jz6.minNumberInRotateArray(array));

    }
}
