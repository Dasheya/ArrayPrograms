public class frequencyOfArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,4,1,2};
        findElementFrequency(array);
    }
    private static void findElementFrequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println(arr[i] + ": " + count + " times");
        }
    }
}
