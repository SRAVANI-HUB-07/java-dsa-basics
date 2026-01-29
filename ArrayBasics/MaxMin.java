package ArrayBasics;

public class MaxMin {
    public static void main(String[] args) {

        int arr[] = { -2, 7, 0, 4, -6, 3, 9 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Maximum: " + max + "\nMinimum: " + min);
    }
}
