import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraysStrings {

    static ArrayList<String> merge(final String[] words, final String[] more) {
        final ArrayList<String> sentence = new ArrayList<String>();
        for (final String w : words)
            sentence.add(w);
        for (final String w : more)
            sentence.add(w);
        return sentence;
    }

    // 1.1 Is Unique: Implement an algorithm to determine if a string has all unique
    // characters. What if you cannot use additional data structures?
    // Javascript
    // function isUnique(str)
    // {
    // let retVal = true;
    // for(let i = 0; i < str.length; i++)
    // {
    // for(let j = i+1; j < str.length; j++)
    // {
    // // str[i] === str[j] ? retVal = false : retVal = true
    // if(str[i] === str[j])
    // {
    // retVal = false;
    // break;
    // }
    // // console.log(i,j);

    // }
    // if(retVal === false)
    // break;
    // }
    // return retVal;
    // }

    // function isUnique(str)
    // {
    // for(let i = 0; i < str.length; i++)
    // {
    // for(let j = i+1; j < str.length; j++)
    // {
    // if(str[i] === str[j])
    // return false;
    // }
    // }
    // return true;
    // }

    // function isUnique(str) {
    // for (let i = 0; i < str.length; i++)
    // for (let j = i + 1; j < str.length; j++)
    // if (str[i] === str[j]) return false;

    // return true;
    // }

    static boolean isUnique(final String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("str.charAt(" + i + ") " + str.charAt(i));
                    System.out.println("str.charAt(" + j + ") " + str.charAt(j));
                    return false;
                }
            }

        }
        return true;
    }

    static boolean isUniqueChar(final String str) {
        final int ARRAY_LENGTH = 128;

        if (str.length() > ARRAY_LENGTH)
            return false;

        final boolean[] bAsciiTable = new boolean[ARRAY_LENGTH];
        int asciiCode = 0;
        for (int index = 0; index < str.length(); index++) {
            asciiCode = str.charAt(index);
            if (bAsciiTable[asciiCode] == true) {
                return false;
            }
            bAsciiTable[asciiCode] = true;
        }
        return true;
    }

    // 1.2 Check Permutation: Given two strings, write a method to decide if one is
    // a permutation of the other.
    // Javascript
    // function isPermutation(a,b)
    // {
    // return ((a.length === b.length) && (a.split('').sort().join() ===
    // b.split('').sort().join()));
    // }

    static boolean isPermutation(String strA, String strB) {
        if (strA.length() != strB.length())
            return false;

        // char[] arrayA = strA.toCharArray();
        // char[] arrayB = strB.toCharArray();

        int[] asciiTable = new int[128];

        for (int i = 0; i < strA.length(); i++) {
            if (strA.charAt(i) < 0 || strA.charAt(i) > 127) {
                return false;
            }
            asciiTable[strA.charAt(i)]++;
        }

        for (int i = 0; i < strB.length(); i++) {
            if (--asciiTable[strB.charAt(i)] < 0)
                return false;
        }

        return true;
    }

    // 1.3 URLify: Write a method to replace all spaces in a string with '%20: You
    // may assume that the string has sufficient space at the end to hold the
    // additional characters, and that you are given the "true" length of the
    // string. (Note: If implementing in Java, please use a character array so that
    // you can perform this operation in place.)
    // EXAMPLE
    // Input: "Mr John Smith " J 13
    // Output: "Mr%20J ohn%20Smith" =
    // Javascript
    // function URLify(string, length) {
    // let retVal = [];
    // retVal = [...string];
    // // retVal = string.split('');
    // // retVal = Array.from(string);
    // // retVal = Object.assign([], string);

    // console.log(url);
    // for (let i = 0; i < 13; i++) {
    // console.log(retVal[i], retVal[i] == " ");
    // if (retVal[i] == " ") {
    // retVal.splice(i, 1, "%02");
    // i = i + 2;
    // }
    // }
    // return retVal.join("");
    // }

    // let url = "Mr John Smith ";
    // console.log(URLify(url, 13));

    static String URLify(String url, int length) {
        StringBuffer sb = new StringBuffer("");

        System.out.println("url : " + url);
        System.out.println("url.length() : " + url.length());

        for (int i = 0; i < length; i++) {
            char c = url.charAt(i);
            System.out.println(i + " : " + c);
            if (c == ' ') {
                sb.append("%20");
                System.out.println("c == '' sb.toString() : " + sb.toString());
            } else {
                sb.append(c);
                System.out.println("c == '' sb.toString() : " + sb.toString());
            }
        }
        return sb.toString();
    }

    // 1.4 Palindrom Permutation: Given a string, write a function to check if it is
    // a permutation of a palin- drome. A palindrome is a word or phrase that is the
    // same forwards and backwards. A permutation is a rearrangement of letters.The
    // palindrome does not need to be limited to just dictionary words.
    // EXAMPLE
    // Input: Tact Coa
    // Output: True (permutations: "taco cat". "atco cta". etc.)

    public static void main(final String[] args) {

        // merge
        // String[] words = { "I", "Love", "You", "!!" };
        // System.out.println(merge(words, words));

        // 1.1 Is Unique: Implement an algorithm to determine if a string has all unique
        // characters. What if you cannot use additional data structures?

        // InputStream in = System.in;
        // InputStreamReader reader = new InputStreamReader(in);
        // BufferedReader br = new BufferedReader(reader);

        // String a = "";
        // while (!a.equals("quit")) {
        // System.out.println("a : " + a);
        // try {
        // a = br.readLine();
        // System.out.println(a);
        // System.out.println("isUnique(a) : " + isUnique(a));
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // }
        // System.out.println(a);

        // Scanner sc = new Scanner(System.in);
        // while (!sc.hasNext("exit")) {
        // // System.out.println("isUnique(a) : " + isUnique(sc.next()));
        // System.out.println("isUniqueChar(a) : " + isUniqueChar(sc.next()));
        // // System.out.println(sc.hasNextInt() ? "(int) " + sc.nextInt()
        // // : sc.hasNextLong() ? "(long) " + sc.nextLong()
        // // : sc.hasNextDouble() ? "(double) " + sc.nextDouble()
        // // : sc.hasNextBoolean() ? "(boolean) " + sc.nextBoolean() : "(String) " +
        // // sc.next());
        // }

        // 1.2 Check Permutation: Given two strings, write a method to decide if one is
        // a permutation of the other.

        // Scanner sc = new Scanner(System.in);
        // while (!sc.hasNext("exit")) {
        // // System.out.println("isUnique(a) : " + isUnique(sc.next()));
        // String strA = sc.next();
        // sc.hasNext();
        // String strB = sc.next();
        // System.out.println("isPermutation(a) : " + isPermutation(strA, strB));
        // // System.out.println(sc.hasNextInt() ? "(int) " + sc.nextInt()
        // // : sc.hasNextLong() ? "(long) " + sc.nextLong()
        // // : sc.hasNextDouble() ? "(double) " + sc.nextDouble()
        // // : sc.hasNextBoolean() ? "(boolean) " + sc.nextBoolean() : "(String) " +
        // // sc.next());
        // }

        // 1.3 URLify: Write a method to replace all spaces in a string with '%20: You
        // may assume that the string has sufficient space at the end to hold the
        // additional characters, and that you are given the "true" length of the
        // string. (Note: If implementing in Java, please use a character array so that
        // you can perform this operation in place.)
        // EXAMPLE
        // Input: "Mr John Smith " J 13
        // Output: "Mr%20J ohn%20Smith"

        // Scanner sc = new Scanner(System.in);
        // while (!sc.hasNext("exit")) {
        // System.out.println("URLify(a) : " + URLify(sc.next(), 100));
        // }
        System.out.println("URLify(a) : " + URLify("Mr John Smith ", 13));
    }
}
