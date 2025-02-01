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
		if (a!=0 && b!=0){
			return a/b;
		}
		else{
			System.out.println("Division by zero is not possible");
			return 0;
		}
	}
	public int fibonocci(int n){
		int n1=0,n2=1,n3;
		if (n==1){
			return n1
		}
		else if (n==2){
			System.out.print(n1+" "+n2);
		}
		else{
			System.out.println(n1+" "+n2);
			for (int i=2;i<n;i++){
				n3=n1+n2;
				System.out.println(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
	}
}