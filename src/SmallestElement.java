public class SmallestElement {
    public static void main(String[] args) {
        int [] arr = {2, 91, 9, 75, 10};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element in an array: " + min);
    }
}
