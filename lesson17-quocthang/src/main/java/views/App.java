package views;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;

public class App 
{
	private static ItemGroupService itemGroupService;
    
	static {
		itemGroupService = new ItemGroupService();
	}
	
	public static void main( String[] args ) {
    	List<ItemGroup> itemGroupAll = itemGroupService.getAll();
    	itemGroupAll.forEach(System.out::println);
    	
    	System.out.println("=======================");
    	
    	ItemGroup itgsById = itemGroupService.getItemGroups(3);
    	System.out.println(itgsById);
    	
    	System.out.println("=======================");	
    	List<ItemGroup> itgsByName = itemGroupService.getItemGroups("Áo");
    	itgsByName.forEach(System.out::println);
    	
//    	System.out.println("=======================");
//    	itemGroupService.save(new ItemGroup(19, "Item Group 19"));
    	
    	System.out.println("6.=======================");
    	itemGroupService.update(1);
    	
    	System.out.println("10.=======================");
    	List<ItemGroup> itgsByIdProcedure = itemGroupService.getItemGroup10(3);
    	itgsByIdProcedure.forEach(System.out::println);
    	
    	System.out.println("7.=======================");
    	itemGroupService.saveFile();
	}
}
