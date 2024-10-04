// //package JAVA COURSE.Arrays;

// public class basic {
//     public static void updated(int marks[]) {
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i] + 1;
//         }
        
//     }
//     public static void main(String[] args) {
//        int marks[]={95,96,97};
//        updated(marks);
//        for(int i=0;i<marks.length;i++){
//         System.out.println(marks[i]);
//        }

     

//     }
    
// }
class basic{
    public static void main(String[] args) {
        int num = 121;
        int result = 0;
        int r,temp;
        temp = num;

        while(num != 0){
            r = num % 10;
            result = (result*10) + r;
            num = num / 10;
        }
        
        if(temp == result){
            System.out.println("Palindrom");
        } else{
            System.out.println("Not a Palindrom");
        }
    }
}