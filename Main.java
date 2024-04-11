package java8questions;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("My system works");

		//using our interface with the help of lambda
		
		MyInterface i = ()->System.out.println("first lamba");
		i.sayHello();
		
		MyInterface i1 = ()->System.out.println("second lambda");
		i1.sayHello();
		
		SumInterface sumInterface = (a,b) ->  a+b;
		System.out.println(sumInterface.sum(2, 3));
		System.out.println(sumInterface.sum(4, 7));
		
		LengthInter lengthInter = (str -> str.length());
		System.out.println("Length of the string is"+lengthInter.getLength("Ashish Kabi"));
	}

}
