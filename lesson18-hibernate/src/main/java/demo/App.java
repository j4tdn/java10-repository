package demo;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceIml;

public class App {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceIml();
	}

	public static void main(String[] args) {
		List<ItemGroupDto> igrps = itemGroupService.getItemGroupDtos();
		igrps.forEach(System.out::println);
//		List<ItemGroup> igrps = itemGroupService.getAll();
//		igrps.forEach(System.out::println);
		
		//igrps.forEach(ig->System.out.println(ig.getName()));
		//show(igrps);
		
//		ItemGroup igrps = itemGroupService.get(2);
//		System.out.println(igrps);
	}

	private static <E> void show(List<E> element) {
		element.forEach(System.out::println);
	}
	
}
