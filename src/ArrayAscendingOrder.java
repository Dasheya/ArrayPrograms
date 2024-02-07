import java.util.Arrays;
public class ArrayAscendingOrder {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 6, 3, 7, 4};
        System.out.println("Original array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(array));
    }
}