import java.util.*;
public class A<T>{
	private T data;
	public A(T data){
	this.data=data;
}
public T getData(){
	return data;
}
public void setData(T data){
	this.data = data;
}

public static void main(String[] args){
	A<Integer> a = new A<Integer>(10);
	System.out.println(a.getData());
	A<String> s= new A<String>("Hello");
	System.out.println(s.getData());
}
}