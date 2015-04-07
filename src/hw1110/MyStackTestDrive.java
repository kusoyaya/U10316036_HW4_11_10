package hw1110;

public class MyStackTestDrive {
	public static void main(String[] args){
		hw1110.MyStack s = new hw1110.MyStack(); //create a stack
		java.util.Scanner input = new java.util.Scanner(System.in); //create a scanner
		System.out.println("Please input five String");
		String[] order = {"first","second","third","fourth","fifth"};
		for(String i : order){
			System.out.println("Please input the "+i+" String:");
			s.push(input.next());
		} //get five string from user
		System.out.println("Starting to display in reverse order...");
		while(!s.isEmpty()){
			System.out.println(s.pop());
		} // display them with pop method to get reversed order
		input.close();
	}
}
