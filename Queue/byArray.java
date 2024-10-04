//package JAVA COURSE.Queue;
import java.util.*;
public class byArray {
    public class Queue1{
        static int  arr[];
        static int size;
        static int rare;
        static int front;


        Queue1(int n){
            arr = new int[n];
            size = n;
            rare = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rare ==-1;
        }

        // Add
        public static void add(int data){
            if(rare==size-1){
                System.out.println("Queue is full ");
                return;
            }

            rare = rare + 1;
            arr[rare] = data;
        }

        //Remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            int front =arr[0];
            for(int i=0;i<rare;i++){
                arr[i] = arr[i+1];
            }
            rare = rare -1;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue1(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
