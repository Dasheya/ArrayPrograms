public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {15, 446, 1, 2, 63, 23, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.print("The second largest element of array is  " + arr[1]);

    }
}