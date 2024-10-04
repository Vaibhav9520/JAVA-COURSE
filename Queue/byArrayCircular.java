
// import java.util.*;
// public class byArrayCircular {
//     public class Queue1{
//         static int  arr[];
//         static int size;
//         static int rare;
//         static int front;


//         Queue1(int n){
//             arr = new int[n];
//             size = n;
//             rare = -1;
//             front = -1;
//         }

//         public static boolean isEmpty(){
//             return rare ==-1 && front == -1;
//         }
//         //full
//         public static boolean isFull(){
//             return (rare+1)%size == front;
//         }

//         // Add
//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("Queue is full ");
//                 return;
//             }

//             if(front == -1){
//                 front = 0;
//             }
//             rare = (rare + 1)% size;
//             arr[rare] = data;
//         }

//         //Remove
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue ");
//                 return -1;
//             }


//             int result = arr[front];
//             front = (front + 1)%size;
//             //last element 
//             if(rare == front){
//                 rare = front = -1;
//             }else{
//                 front = (front + 1)%size;
//             }
//             return result;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue ");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue1(3);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
    
// }

import java.util.*;

public class byArrayCircular {
    public static class Queue1 {
        private int[] arr;
        private int size;
        private int rare;
        private int front;

        public Queue1(int n) {
            arr = new int[n];
            size = n;
            rare = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rare == -1 && front == -1;
        }

        public boolean isFull() {
            return (rare + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full ");
                return;
            }

            if (isEmpty()) {
                front = 0;
            }
            rare = (rare + 1) % size;
            arr[rare] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue ");
                return -1;
            }

            int result = arr[front];
            if (rare == front) {
                rare = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue ");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1(4);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
