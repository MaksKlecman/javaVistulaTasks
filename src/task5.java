
import java.util.Scanner;

public class task5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter word: ");
        String word = sc.nextLine();

        word = word.toLowerCase();


        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("word is palidrome");
        }
        else
        {
            System.out.println("This word is not palindrome");
        }

        sc.close();

    }
}
