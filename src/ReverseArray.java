import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {
        int maxArrayIndex = array.length - 1;
        int halfArrayLength = array.length / 2;

        System.out.println("Array = " + Arrays.toString(array));

        for (int i = 0; i < halfArrayLength; i++) {
            int temp = array[i];
            array[i] = array[maxArrayIndex - i];
            array[maxArrayIndex - i] = temp;
        }

        int[] reversedArray = array;
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4,5,6};
        reverse(array);
    }
}
