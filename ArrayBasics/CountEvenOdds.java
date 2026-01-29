package ArrayBasics;

public class CountEvenOdds {
    public static void main(String args[]) {
        int arr[] = { 3, 9, 8, 6, 5, 0, 2, 1, 12, -7, -8, 10 };
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenCount += 1;

        }
        System.out.println("Even Count : " + evenCount + "\n Odd Count : " + (arr.length - evenCount));
    }
}
