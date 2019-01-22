

import java.util.Scanner;

public class Ankit {
	String name;
	Scanner input;
	int sum=0;
	Ankit(){
		input = new Scanner(System.in);
	}

public void getName() {
	System.out.println("Enter the name:");
	name=input.next();
	for(int i=0;i<name.length();i++) {
		
		sum=sum+(int)name.charAt(i);
		
	}
	System.out.println(sum);
	
}
public static void main(String[] args) {
	Ankit ob=new Ankit();
	ob.getName();
}
}
