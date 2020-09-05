package main.剑指offer.牛客第一轮错题;

public class JZ6 {
    public int minNumberInRotateArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while (left < right) {
            mid = left + (right - left) / 2;  //当left == right时返回array[left]  mid 明显合起来要大于left、right所以不返回mid
            if (array[mid] > array[right]) {
                left = mid + 1;
            } else if (array[mid] < array[right]) {
                right = mid;
            } else if (array[mid] == array[right]) { //当出现 234111112 mid和j都是1
                right = right - 1;
            }
        }
        return array[right];
    }

    public static void main(String args[]) {
        JZ6 jz6 = new JZ6();
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(jz6.minNumberInRotateArray(array));

    }
}
