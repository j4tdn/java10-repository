package ex02;

public class arrange {
	public static void main(String[] args) {
		int [] digits = {2,15,21,15,0,7};
		int [] uniqueArray = getUniqueElements(digits);		
		System.out.println("\n=======");
		printf(uniqueArray);
	}
	private static int [] getUniqueElements(int [] elements) {
		int[] result = new int[elements.length];
		int [] isDupFlags = new int [elements.length];
		for ( int out=0; out<elements.length;out++) {
					if(elements[out]%7==0&&elements[out]%35!=0) {
						isDupFlags[out]=1;
				}	
					else if(elements[out]%5==0&&elements[out]%35!=0) {
						isDupFlags[out]=3;
					}
					else if(elements[out]%35==0 || (elements[out]%7!=0 && elements[out]%7!=0)) {
						isDupFlags[out]=2;
					}
		}
		int count = 0;
		for(int i=0;i<elements.length;i++) {
			if(isDupFlags[i]==1) {
				result[count]=elements[i];
				count ++;
			} 
		}
		for(int i=0;i<elements.length;i++) {
			if(isDupFlags[i]==2) {
				result[count]=elements[i];
				count ++;
			} 
		}
		for(int i=0;i<elements.length;i++) {
			if(isDupFlags[i]==3) {
				result[count]=elements[i];
				count ++;
			} 
		}
		return result;
	}
	private static void printf(int [] elements) {
		for(int element: elements) {
			System.out.print(element + " ");
		}
	}

}
