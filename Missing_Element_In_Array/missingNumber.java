public class missingNumber {
    public static int findMissingNumber(int[] arr, int N) {
        int totalSum = N * (N + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] array = {1, 2, 4, 5};

        System.out.println("Missing number is: " + findMissingNumber(array, N));
    }
}
