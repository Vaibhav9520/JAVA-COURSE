import java.util.*;

public class makingStake {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>(); 

        // Empty function

        public boolean isEmpty(){
            return list.size() == 0;
        }

        //push function

        public static void push(int data){
            list.add(data);
        }

        //pop function
        public int pop(){
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;

        }

        //peek function
        public int peek(){
            return list.get(list.size() - 1);
        }
    }

    // main function

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println("Stack Elements are :"+ s.peek());
            s.pop();
        }
    }
    
}
