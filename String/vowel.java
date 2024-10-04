//Question 1: Count how many times lower case vowels occurred in a String entered by 
// the user.
import java.util.*;
public class vowel {
    public static void CheckVowel(String str) {
        int count = 0;
        for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o'||
        ch == 'O' || ch == 'u' || ch == 'U' ){
            count++;
        }
    }
    System.out.println("Total vowel in String is : " + count);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        CheckVowel(str);
    }
    
}
