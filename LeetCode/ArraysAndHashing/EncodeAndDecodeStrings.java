package LeetCode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Problem: Encode and Decode Strings

Pattern: String Encoding / Length-Prefix Encoding

Data Structure: StringBuilder + ArrayList

Algorithm: Encode each string by storing its length followed by a delimiter
and the string itself. During decoding, find the delimiter to extract the
length, then use that length to extract the exact original string. Continue
until the entire encoded string is processed.

Time Complexity: O(m)

Reason: Each character across all input strings is processed while encoding
and decoding, where m is the total number of characters.

Space Complexity: O(m + n)

Reason: The encoded/decoded data requires O(m) space for the characters,
and the result list contains n string entries.

Key Idea: Storing the length before each string makes decoding unambiguous,
even when the strings themselves contain the delimiter character.
*/

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {
            str.append(strs.get(i).length())
                    .append('a')
                    .append(strs.get(i));
        }

        return str.toString();
    }

    public List<String> decode(String str) {

        int i = 0;
        List<String> strs = new ArrayList<>();

        while (i < str.length()) {

            int delimiterPosition = str.indexOf('a', i);

            String lengthStr = str.substring(i, delimiterPosition);
            int length = Integer.parseInt(lengthStr);

            strs.add(
                    str.substring(
                            delimiterPosition + 1,
                            delimiterPosition + 1 + length));

            i = delimiterPosition + length + 1;
        }

        return strs;
    }

    public static void main(String[] args) {

        EncodeAndDecodeStrings EDString = new EncodeAndDecodeStrings();

        // Original list of strings
        List<String> strs = Arrays.asList(
                "Hello",
                "World",
                "Java");

        System.out.println("Original: " + strs);

        // Encode
        String encodedString = EDString.encode(strs);
        System.out.println("Encoded:  " + encodedString);

        // Decode
        List<String> decodedStrings = EDString.decode(encodedString);
        System.out.println("Decoded:  " + decodedStrings);
    }
}