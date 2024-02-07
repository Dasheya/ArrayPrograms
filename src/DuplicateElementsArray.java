public class DuplicateElementsArray {
    public static void main(String[] args) {
        int[] array={1,2,2,4,3,3};
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++)
                if (array[i] == array[j]) {
                    System.out.println("Duplicate numbers in an array:" + array[i]);
                }
        }
    }
}
