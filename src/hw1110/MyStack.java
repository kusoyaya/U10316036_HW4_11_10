package hw1110;

public class MyStack<E> extends java.util.ArrayList<E>{
	public int getSize(){
		return super.size();
	} // stack getsize is arraylist size
	
	public E peek(){
		return super.get(super.size()-1);
	}// return the last element in arraylist
	
	public E pop(){
		E o = super.get(super.size()-1);
		super.remove(super.size()-1);
		return o;
	}// return the last element first then remove it from arraylist
	
	public void push(E o){
		super.add(o);
	}// push is same to the add in arraylist
	
	@Override
	public String toString(){
		return "Stack: "+ super.toString();
	} //override the tostring method
}
