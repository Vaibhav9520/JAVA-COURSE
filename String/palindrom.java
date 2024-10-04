import java.util.*;
public class palindrom {
    public static boolean CheckPalindrom(String str) {
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return 
                false;
            }
        }return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(CheckPalindrom(str));
        
    }
    
}
