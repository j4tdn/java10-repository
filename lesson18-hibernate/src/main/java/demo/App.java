package demo;

import java.util.Arrays;
import java.util.List;

import persistence.Item;
import persistence.ItemGroup;
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
		Item item = itemService.get(18);
		List<ItemSize> sizes = item.getItemSizes();
		System.out.println("size: " + sizes);
		
		/*
		ItemGroup itemGroup = new ItemGroup();
		itemGroup.setIgrId(999);
		itemGroup.setName("Item Group - 999");
		
		Size sizeL = new Size("L", "L - Nam Nữ 41 - 50KG");
		
		Size sizeXL = new Size("M", "XL - Nam Nữ 51 - 60KG");
		
		Item item = new Item(18, "Aó khoác 6", "Trắng", "Vải", 160d, 260d, "ud.pnd", itemGroup);
		// item.setSizes(Arrays.asList(sizeL, sizeXL));
		
		boolean isValid = itemService.save(item);
		System.out.println("isValid: " + isValid);
		*/
	}

}
