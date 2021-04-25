package structure;

public class Ex02Iterable {
    public static void main(String[] args) {
	// loop: for, while, do while
	// for : elrealy known limitation
	// while do while: undefined
	// dowhile: ignore first checking
    // while: checking as always
    System.out.println("sumFor: " + sumFor(10) + "\nsumwhile: "+ sumwhile(10) + "\nsumDoWhile: " + sumDowhile(10));
    
    // break, continue used in for , while, do while
    // break: switch case
    // break: pause and exit the loop
    // continue: ignore the below code and continnue with next loop
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
        	continue;
        }
        if ( i == 4) {
        	break;
        }
        System.out.println("i: " + i);
    }
    
    System.out.println("come here !!!");
}
    private static int sumFor(int n) {
    	int result = 0;
    	for (int i= 0; i < n; i++) {
    		result += i;
       }
       return result;
    }

    private static int sumwhile(int n) {
        int result = 0;
        int i = 1;
        while (n > 0) {
        	result += n;
        	i++;
        	
    }
    return result;
    }
    private static int sumDowhile(int n) {
        int result = 0;
        int i = 1;
        while (n > 0) {
        	result += n;
        	i++;
        	
    }
    return result;   
}
}
