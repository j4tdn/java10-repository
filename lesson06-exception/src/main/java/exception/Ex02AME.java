package exception;

public class Ex02AME {
	public static void main(String[] args) {
		// bắt lỗi cho mẫu số != 0
		int result = 0;
		try {
			result = divide(10, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("result: " + result);
	}

	// try catch
	// throw (when we know where exactly the error is in the code
	// >> throws << (reverse throw)
	// throws RuntimeException => Redundant (vì nếu hàm bị exception
	// 										đã nằm trong khối try catch mà
	// 										lại là RuntimeException 
	//										-> tự động bắt lỗi mà không cần phải dùng throws)

	// throws CompileException => Mandatory
	
	private static int divide(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception();
		}
		return a / b;
	}
}
