package Strings;

//The time complexity is O(n) because string concatenation and the contains check both take linear time. The space complexity is O(n) due to the creation of the doubled string.”

public class StringRotation {
    public static void main(String args[]) {
        String str1 = "abcd";
        String str2 = "cdab";

        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.print("rotational");
        } else {
            System.out.print("not rotational");
        }
    }

}
