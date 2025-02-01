
import java.util.ArrayList;
class Calculator{
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int div(int a,int b){
		if (b!=0){
			return a/b;
		}
		else{
			System.out.println("Division by zero is not possible");
			return 0;
		}
	}
	public void fibonocci(int n){
		int n1=0,n2=1,n3;
		if (n==1){
			System.out.print(n1);
		}
		else if (n==2){
			System.out.print(n1+" "+n2);
		}
		else{
			System.out.print(n1+" "+n2);
			for (int i=2;i<n;i++){
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
	}
	public int sumOfArray(ArrayList<Integer> arr){
		int sum=0;
		for(int i=0;i<arr.size();i++){
			sum+=arr.get(i);
		}
		return sum;
	}
	public double meanOfArray(ArrayList<Integer> arr){
		double sum=sumOfArray(arr);
		return sum/arr.size();
	}
	public double varianceOfArray(ArrayList<Integer> arr){
		double mean=meanOfArray(arr);
		double var=0;
		for(int i=0;i<arr.size();i++){
			var+=Math.pow(arr.get(i)-mean,2);
		}
		return var/arr.size();
	}
	public double standardDeviationOfArray(ArrayList<Integer> arr){
		return Math.sqrt(varianceOfArray(arr));
	}
}