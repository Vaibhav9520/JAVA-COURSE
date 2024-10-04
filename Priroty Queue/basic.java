import java.util.*;

class Student implements Comparable<Student>{       //Overriding
    String name;
    int rank;
    public Student(String name, int rank){
        this.name = name;
        this.rank = rank;

    }

    @Override
    public int compareTo(Student s2){
        return this.rank - s2.rank;
    }

}
public class basic {
    public static void main(String[] args) {
        //PriorityQueue<Student> pq = new PriorityQueue<>();
        //For reverse order
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Ram Singh", 45));
        pq.add(new Student("Nitin Kumar", 83));
        pq.add(new Student("Lahru kaumara", 101));
        pq.add(new Student("Dusmanta Chamera", 34));
        pq.add(new Student("Mathisha Pathirana", 555));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
    
}
