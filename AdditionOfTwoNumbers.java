package AdditionOfTwoNumbers;
// This program has been written to add two numbers one int type and other of float type and the result is stored in int.

public class AdditionOfTwoNumbers { //Declaration of class.
	
	public static void main(String[] args) { // Main method.
		
		int iA=4; 							//Declaring & Initialization of variables.
		float fB = (float) 25.8;			//Declaring & Initialization of variables.
		int iC = 0;							//Declaring & Initialization of variables.
		iC =(int)((float) iA + (float) fB); // Converting data type and adding two numbers.
		System.out.println((int)iC);		// Printing the output.
		
	}

}