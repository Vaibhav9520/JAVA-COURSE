// import java.util.*;
// public class Abc {
//     public static void main(String[] args) {
//         List<Integer> l = Arrays.asList(2,3,4,5);
//         System.out.println("The sum of values are: "+ sum(l));

//         List<Double> l1 = Arrays.asList(2.8,3.9,4.8,5.6);
//         System.out.println("The sum of values are: "+ sum(l1));
//     }
//     public static double sum(List<? extends Number>list){
//         double sum = 0;
//         for(Number i:list){
//             sum = sum + i.doubleValue();
//         }
//         return sum;
//     }
// }

 






import java.util.*;
public class Abc {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(2,3,4,5);
        System.out.println("The sum of values are: "+ sum(l));

        List<Double> l1 = Arrays.asList(2.8,3.9,4.8,5.6);
        System.out.println("The sum of values are: "+ sum(l1));
    }
    public static double sum(List<? extends Number>list){
        double sum = 0;
        for(Number i:list){
            sum = sum + i.doubleValue();
        }
        return sum;
    }
}

 








































