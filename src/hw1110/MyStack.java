package hw1110;

public class MyStack extends java.util.ArrayList{
	public int getSize(){
		return super.size();
	} // stack getsize is arraylist size
	
	public Object peek(){
		return super.get(super.size()-1);
	}// return the last element in arraylist
	
	public Object pop(){
		Object o = super.get(super.size()-1);
		super.remove(super.size()-1);
		return o;
	}// return the last element first then remove it from arraylist
	
	public void push(Object o){
		super.add(o);
	}// push is same to the add in arraylist
	
	@Override
	public String toString(){
		return "Stack: "+ super.toString();
	} //override the tostring method
}
