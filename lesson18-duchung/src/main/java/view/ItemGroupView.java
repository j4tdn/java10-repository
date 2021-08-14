package view;

import java.util.List;

import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceIml;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceIml(); 
	}

	public static void main(String[] args) {
		System.out.println("2.Thống kê số lượng mặt hàng tồn kho của mỗi loại hàng.");
		List<ItemGroupDto> getALL = itemGroupService.getItemGroupDaoById();
		getALL.forEach(System.out::println);

	}
}
