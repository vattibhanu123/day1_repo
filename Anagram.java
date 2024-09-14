import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Welcome guys!";
        String str2 = "Guys welcome!";
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char a[] = str1.toCharArray();
        char b[] = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a, b);
        if (result == true)
            System.out.println("yes Both strings are equal");
        else {
            System.out.println("No Both strings are not equal");
        }

    }
}