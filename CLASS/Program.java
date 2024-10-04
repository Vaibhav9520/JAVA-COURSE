import java.util.*;
class MAIN<T extends Number>{
	T data;
	MAIN(T data){
		this.data = data;
	}
	public void display(){
		System.out.println(this.data);
	}
}
class Program{
	public static void main(String[] args){
	MAIN<Double> l1 = new MAIN<>(23.3);
	l1.display();
	MAIN<Float> l2 = new MAIN<>(22.4f);
	l2.display();
	MAIN<Integer> l3 = new MAIN<>(22);
	l3.display();
	}
}