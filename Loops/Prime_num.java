import java.util.*;
public class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n = sc.nextInt();
        int counter=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }
        if(counter==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime number");
        }
        
    }
    
}
