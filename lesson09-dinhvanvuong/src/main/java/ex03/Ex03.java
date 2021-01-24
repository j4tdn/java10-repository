package ex03;

public class Ex03 {
	public static void main(String[] args) throws Exception {
        String str = "xyz";
        StringBuffer strBuf = new StringBuffer(str);
        Permutation(strBuf,str.length());
    }

    private static void Permutation(StringBuffer str, int index){

        if(index <= 0)
            System.out.println(str);            
        else { 
        	Permutation(str, index-1);
            int currPos = str.length()-index;
            for (int i = currPos+1; i < str.length(); i++) {
                swap(str,currPos, i);
                Permutation(str, index-1);
                swap(str,i, currPos);
            }
        }
    }

    private  static void swap(StringBuffer str, int pos1, int pos2){
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);
    }
}   


