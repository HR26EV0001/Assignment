import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotationCount = 2;

        int[] rotatedArray = rotateArray(array, rotationCount);
        System.out.println(Arrays.toString(rotatedArray));
    }

    public static int[] rotateArray(int[] array, int rotationCount) {
        int length = array.length;
        int[] rotatedArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newIndex = (i + rotationCount) % length;
            rotatedArray[newIndex] = array[i];
        }

        return rotatedArray;
    }
}