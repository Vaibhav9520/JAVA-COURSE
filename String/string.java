// //package JAVA COURSE.String;

// import java.util.*;

// public class string {
//     public static float GetSortestDistance(String path) {
//         int x= 0;
//         int y = 0;
//         for(int i=0;i<path.length();i++){
//             char dir = path.charAt(i);
//             if(dir == "N"){
//                 y++;
//             }else if(dir =="S"){
//                 y--;
//             }else if(dir =="E"){
//                 x++;
//             }else if(dir == "W"){
//                 x--;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);
//     }
//     public static void main(String[] args) {
//         String path = "EWSENSEW";
//         System.out.println(GetSortestDistance(path));

//     }
    
// }
