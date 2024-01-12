class Fibonacci{
	void stack_overflow(int a,int b){
		a=a+b;
		b=b+b;
		Fibonacci f=new Fibonacci();
		f.stack_overflow(a, b);
	}
	public static void main(String[] args) {
		Fibonacci f1=new Fibonacci();
		f1.stack_overflow(10, 20);
	}
}