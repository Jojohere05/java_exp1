import java.util.*;
class UserInput{
	Scanner scan=new Scanner(System.in);
	public int getNumber(){
		return scan.nextInt();
	}
	public ArrayList<Integer> getArray(){
		System.out.println("enter size of array");
		int size=scan.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter " + size + " elements:");
		for (int i=0;i<size;i++){
			System.out.println("Enter element "+(i+1));
			arr.add(getNumber());
		}
		return arr;
	}
	public int selectOperation(){
		System.out.println("\nSelect a calculation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of ArrayList");
        System.out.println("7. Mean of ArrayList");
        System.out.println("8. Variance of ArrayList");
        System.out.println("9. Standard Deviation of ArrayList");
        System.out.print("Enter your choice (1-9): ");
		return scan.nextInt();
	}
	public int fibonociSeq(){
		System.out.println("Enter the number of terms in the Fibonacci sequence:");
		return getNumber();}

	}
	public int performCalculation(){
		int a,b;
		int choice=selectOperation();
		ArrayList<Integer> arr=new ArrayList<Integer> ();
		if (choice!=5){
			arr=getArray();
		}
		switch(choice){
			case 1:
				System.out.println("Enter two numbers:");
				a=getNumber();
				b=getNumber();
				System.out.println("Result: " + calculator.add(a, b));
				break;
			case 2:
				System.out.println("Enter two numbers:");
				a=getNumber();
				b=getNumber();
				System.out.println("Result: " + calculator.sub(a, b));
				break;
			case 3:
				System.out.println("Enter two numbers:");
				a=getNumber();
				b=getNumber();
				System.out.println("Result: " + calculator.mul(a, b));
				break;
			case 4:
				System.out.println("Enter two numbers:");
				a=getNumber();
				b=getNumber();
				double result = calculator.div(a, b);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
			case 5:
				int n=fibonociSeq();
				calculator.fibonacci(n);
                break;
				
			case 6:
				System.out.println("Sum of ArrayList: " + calculator.sumOfArray(arr));
				break;
			case 7:
				System.out.println("Sum of ArrayList: " + calculator.meanOfArray(arr));
				break;
			case 8:
				System.out.println("Sum of ArrayList: " + calculator.varianceOfArray(arr));
				break;
			case 9:
				System.out.println("Sum of ArrayList: " + calculator.standardDeviationOfArray(arr));
				break;
			default:
				System.out.println("Invalid choice");
				
		}
	}
}