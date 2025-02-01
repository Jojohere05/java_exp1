import java.util.*;
class UserInput{
	int [] userInput(){
	int[] numbers = new int[2];
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the first no");
	numbers[0]=scan.nextInt();
	System.out.println("enter the first no");
	numbers[1]=scan.nextInt();
	return numbers;

	}
	}