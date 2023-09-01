package Week04;


import java.util.*;

public class week04ArraysandMethods {

	

	public static void main(String[] args) {
		System.out.println("Number 1:");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 5};
		
		// first age subtracted by the last age in the array. 
		System.out.println("First age subtracted by the last age = " + (ages[ages.length -1 ] - ages[0]));
		
		//sum variable for the enhanced loop
		int sum = 0;
		
		//the enhanced loop that iterate the array and calculate the avg age.
		for(int age : ages) {
			sum += age;
		}
		
		// calculate the avg age using the loop
		System.out.println("The avg age:" + (sum/ages.length));
		
		System.out.println("Number 2:");
		//the array string of names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// String length for storing the length of each element
		int stringLength = 0;
	
		//loop for calculate the number avg number of letters per name. 
		for(String name : names) {
			stringLength += name.length();
		}
		//Calculate the avg name length 
		System.out.println("Avg Name length =" + (stringLength/names.length));
		
		//concat variable to add "Dill" to the names for example
		String concat = "";
		
		//The enhanced loop for that iiterates over each string name and combines the length of each word and add concat 
		for (String name : names) {
			concat = concat + name + " ";
		}
		//print nonconcat names 
		System.out.println(concat);
		
		System.out.println("Number 3:");
		System.out.println("The last element an array with 'arrayName.length - 1'.");
		
		System.out.println("Number 4:");
		System.out.println("The first element of an array with 'arrayName[0]'.");
		
		//new array variable called nameLengths
		System.out.println("Number 5:");
		int[] nameLengths = new int [names.length];
		
		//write a loop over the previously created names array and add the length of each name to the nameLengths array
		for (int i = 0;i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.println("Number 6:");
		// intiate the sumLengths variable
		int sumLengths = 0;
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array
		for (int length: nameLengths) {
			sumLengths += length;
		}
		
		// the sum of the element nameLengths.
		System.out.println("Sum of nameLengths = " + sumLengths);
		
		System.out.println("Number 7:");
		// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated
		//to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		String word = "Hello";
		int c =3;
		
		System.out.println(concatenateString(word, c));
		
		System.out.println("Number 8:");
		
		//Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//(the full name should be the first and the last name as a String separated by a space)
		String firstName = "Cedrick";
		String lastName = "Simmons";
		String fullName = firstName + " " + lastName;
		
		System.out.println("Full Name:" + fullName);
		
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		System.out.println("Number 9:");
		System.out.println(greaterThanOneHundred(ages));
		
		System.out.println("Number 10:");
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] doubles = {1.1, 2,2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
		System.out.println(averageOfDoubles(doubles));
		
		System.out.println("Number 11:");
		//Write a method that takes two arrays of double and returns true if the average 
		//of the elements in the first array is greater than the average of the elements in the second array.
		double[] doublesTwice = {1.2, 3.4, 5.6, 7.8, 9.0};
		
		System.out.println(avgIsGreater(doubles, doublesTwice));
		
		System.out.println("Number 12:");
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
		//if it is hot outside and if moneyInPocket is greater than 10.50.
		
		boolean hot = true;
		double cash = 18.00;
		
		System.out.println(willBuyDrink(hot, cash));
		
		System.out.println("Number 13:");
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		Scanner s = new Scanner(System.in);
		
		int[] exams = new int[6];
		System.out.println("what was your final score");
		int finalScore = s.nextInt();
		
		System.out.println("what are the other scores? enter 6");
		
		exams[0] = s.nextInt();
		exams[1] = s.nextInt();
		exams[2] = s.nextInt();
		exams[3] = s.nextInt();
		exams[4] = s.nextInt();
		exams[5] = s.nextInt();
		
		theFinalGrade(exams, finalScore);

				

	}

	private static void theFinalGrade(int[] testScores, int finalExam) {
		int sum = finalExam;
		for (int score : testScores) {
			sum += score;
		}
		int avg = sum / (testScores.length + 1);
		System.out.println("final score:" + avg);
		if (avg > 60) {
			System.out.println("You have passed the exam"); 
		} else {
			System.out.println("You have failed the exam");
		}
	}

	private static boolean willBuyDrink(boolean hotOutSide, double cashInBag) {
		if (hotOutSide == true && cashInBag > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	private static boolean avgIsGreater(double[] doubleOne, double[] doubleTwo) {
		double firstSum = 0;
		double secondSum = 0;
		
		for (double age : doubleOne) {
			firstSum += age;
		}
		for (double age: doubleTwo) {
			secondSum += age;
		}
		if ((firstSum/ doubleOne.length) > (secondSum/ doubleTwo.length)) {
			return true;
		}else {
			return false;
		}
	}
	
	private static double averageOfDoubles(double[] ages) {
		double sum = 0;
		
		for (double age : ages) {
			sum += age;
		}
		return sum/ ages.length;
	}

	private static boolean greaterThanOneHundred(int[] ages) {
		int sum = 0;
		for ( int age: ages) {
			sum += age;
		}
		if (sum > 100) {
			return true;
		}else {
		return false;
		}
	}
	
	private static String concatenateString(String word, int c) {
		String result = "";
		
		for(int i = 0; i < c; i++) {
			result += word;
		}
		
		return result;
	}

	

	
	}

	

	
		

	


	


