import java.util.Scanner;

class TableGenerator{
	public static void main(String[] args){
		System.out.println("This number generates the table of the given number");		
		Scanner hello = new Scanner(System.in);
		System.out.println("Enter a number that is not zero:");
		Long value = hello.nextLong();
		int multiplier ;
		for(multiplier = 1; multiplier <= 10; multiplier++)
		System.out.println(value*multiplier);
	}
}