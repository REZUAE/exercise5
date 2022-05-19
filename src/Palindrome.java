import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a str: ");
        String str = sc.nextLine();
        String reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i)
        {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase()))
        {
            System.out.println(str + " is a Palindrome Str.");
        }
        else
        {
            System.out.println(str + " is not a Palindrome Str.");
        }
    }
}
