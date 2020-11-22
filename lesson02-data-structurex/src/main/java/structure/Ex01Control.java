package structure;

public class Ex01Control {
 public static void main(String[] args) {
	//if else
	 // switch case
	 // condition operator
	 System.out.println("max: " +max(1,2,3));
	 demoSwitchCase();
}
 private static void demoSwitchCase() {
	 int month =8;
	 switch(month) {
	 case 1: 	
	 case 3: 		
	 case 8: 
		 System.out.println("31 days ");
		 break;
	 case 4: 			
	 case 6: 		
	 case 9: 
		 System.out.println("30 days ");
		 break;
		default:
			 System.out.println("Invalid month ");
		 // case k roi vao cac truong hop sau nhay xuong default:
		 
	 }
	 }
	 
 private static int max(int first, int second) {
	 if(first>second )
	 {
		 return first;
	 }
	 else return second;
 }
 // max 3 digits
 private static int max(int first, int second, int third) {
	return max(max(first,second),third);
    
}
}