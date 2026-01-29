package ArrayBasics;

public class ReverseArray {
    public static void main(String args[]) {
        int arr[] = { 9, -2, 7, 8, 2, 12 };
        int temp;
        System.out.print("Array original order: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        for (int i = 0; i < (arr.length) / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.print("\nArray reversed order: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
}
