package view;

import java.util.Arrays;
import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
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
    	
    	System.out.println("=======================");
//    	itemGroupService.save(new ItemGroup(18, "Item Group 18"));
    	
    	System.out.println("=======================");
    	List<ItemGroupDto> igrsById = itemGroupService.getItemGroups();
    	igrsById.forEach(System.out::println);
    	
    	System.out.println("=======================");
    	itemGroupService.addBatch(Arrays.asList(
    			new ItemGroup(104, "Item Group 104"),
    			new ItemGroup(105, "Item Group 105")));
	}
}
