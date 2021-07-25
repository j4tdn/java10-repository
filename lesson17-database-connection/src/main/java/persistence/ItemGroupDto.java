package persistence;

import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemGroupDto {
	private Integer id;
	private String name;
	private Map<String, Integer> items;	// itemName, amount
	private Integer totalAmout;
	
	public ItemGroupDto(ItemGroupRawData raw) {
		this.id = raw.getId();
		this.name = raw.getName();
		this.items = Pattern.compile(",")
		        .splitAsStream(raw.getItems())
		        .collect(Collectors.toMap(item -> item.substring(0, item.indexOf("-")) , item -> Integer.parseInt(item.substring(item.indexOf("-") + 1))));
		this.totalAmout = raw.getTotalAmout();
	}
}
