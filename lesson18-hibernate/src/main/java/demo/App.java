package demo;

import java.util.Arrays;
import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.ItemSize;
import persistence.Size;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
//		List<ItemGroup> elements = itemGroupService.getAll();
//		elements.forEach(System.out::println);
		
//		ItemGroup igr = itemGroupService.get(2);
//		System.out.println(igr);
		
//		List<ItemGroup> igs = itemGroupService.getAll();
//		igs.forEach(ig -> System.out.println(ig));
//		
//		System.out.println("=====================");
//		
//		List<Item> items = itemService.getAll();
//		items.forEach(System.out::println);
//		
//		Item it1 = itemService.getItem(5);
//		System.out.println(it1);
//		
//		Item it2 = itemService.getItem(5);
//		System.out.println(it2);
//		Item item1 = itemService.get(1);
//		System.out.println(item1);
//		System.out.println("==============");
//		Item item2 = itemService.get(1);
//		System.out.println(item2);
//		
//		List<ItemGroupDto> result = itemGroupService.getDtos();
//		result.forEach(System.out::println);
		
//		boolean isValid = itemGroupService.save(new ItemGroup(32, "item group 32-"));
//		System.out.println(isValid);
		
		
//		ItemGroup itemGroup = new ItemGroup();
//		itemGroup.setIgrId(99999);
//		itemGroup.setName("Itemgroup 99999");
//		
//		Size sizeL = new Size("L1", "L - Nam Nữ 41 - 50KG");
//		
//		Size sizeXL = new Size("XL1", "XL - Nam Nữ 51 - 60KG");
//		
//		List<Size> sizes = Arrays.asList(sizeL, sizeXL);
//		
//		
//		Item item = new Item(17, "Ao So Mi nam", "den", "UX", 100.00, 200.00, "a.png", itemGroup);
//		boolean isValid = itemService.save(item);
//		System.out.println(isValid);
		
		Item item = itemService.get(16);
		List<ItemSize> sizes = item.getItemSizes();
		System.out.println(sizes);
	}
	
//	private static <E> void show(List<E> elements) {
//		elements.forEach(System.out::println);
//	}
	

}
