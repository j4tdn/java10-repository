package exercises;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
//		int sum = operate(a,b,new Operator() {
//			
//			@Override
//			public int strategy(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//		});
		
		//int mul = operate(a,b,(x, y) ->  x*y);
		System.out.println("result: " +operate(a,b,(x, y) ->  x*y));
		//operate
		
//		System.out.println("result :" + sum);
	}
	
	private static int operate(int a,int b,Operator operator) {
		return operator.strategy(a,b);
	}
}
