package operators;

public class arithmeticoperator {

	public static void main(String[] args) {
      /*int a = 10;
		int b = 3;
		System.out.println("a+b=" + (a + b));
		System.out.println("a-b=" + (a - b));
		System.out.println("a*b=" + (a * b));
		System.out.println("a/b=" + (a / b));
		System.out.println("a%b=" + (a % b));*/

		//assignment
	/*	int f=1;
		System.out.println("f += 3: " + (f +=3));
		System.out.println("f -= 2: " + (f -=2));
		System.out.println("f *= 4: " + (f *=4));
		System.out.println("f /= 3: " + (f /=3));*/
		
		//relational operator
	/*	int a = 10;
		int b = 3;
		int c = 5;
		System.out.println("a > b: " + (a > b));
		System.out.println("a < b: " + (a < b));
		System.out.println("a >= b: " + (a >= b));*/
		
		//logical 
		/*boolean x = true;
		boolean y = false;
		System.out.println("x&&y:" + (x&&y));
		System.out.println("x||y:" + (x||y));
		System.out.println("!x:" + (!x));*/
		
		//unary,only for 1 operator.post & pre increments
		/* int a = 10;
		 int b = 20;
		 System.out.println("postincrement : " + (a++));
		 System.out.println("preincrement : " + (++a));
		 System.out.println("postdecrement : " + (b--));
		 System.out.println("predecrement : " + (--b));
		 System.out.println("predecrement : " + (--b));
		 System.out.println("postincrement : " + (a++));
		 System.out.println("postincrement : " + (a++));*/
		
		//ternary
		int n1 = 5, n2 = 10, max;
		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);
		max = (n1>n2) ? n1 : n2;
		System.out.println("Maximum is =" +max);
		
	}
	
}
