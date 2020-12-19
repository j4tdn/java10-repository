package view;

import view.Vehicle;

public class ex02b {
       public static void main(String[] args) {
    	  System.out.println("id\t        name\t      capacity\t Cost  \t        tax");
          System.out.println("=====================================================================");  
			Vehicle car1 = new Vehicle("Ngọc Thuận\t", "Lambor \t        " , 2000    ,    2000000000 , 40000000);
			Vehicle car2 = new Vehicle("Xuân Thành\t", "bugati\t        ",150, 150000000 , 45000000);
            Vehicle car3 = new Vehicle("Hữu phúc\t", "Mec\t        ", 50, 100000000 , 10000000);
            
          System.out.println(car1);
      	  System.out.println(car2);
      	  System.out.println(car3);
    	   
    		 
    		  
	}
}
