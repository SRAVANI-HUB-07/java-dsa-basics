package ArrayBasics;

public class SumElements {
    public static void main(String args[]) {
        int arr[] = { -8, 9, 7, 4, 0, -4 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}
