public class first {
    public static void main(String[] args){
        int a = 5;
        int fac = 1;
        for(int i=1; i<=a; i++){
            fac = fac * i;
        }
        System.out.println("Factorial of " + a + " is : " + fac);
    }
}
