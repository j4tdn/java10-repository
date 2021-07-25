package persistence;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemGroupRawData {
	private Integer id;
	private String name;
	private String items;	
	private Integer totalAmout;
	
	public ItemGroupDto transfer() {
		ItemGroupDto dto = new ItemGroupDto();
		dto.setId(getId());
		dto.setName(getName());
		dto.setItems(Pattern.compile(",")
		        .splitAsStream(getItems())
		        .collect(Collectors.toMap(item -> item.substring(0, item.indexOf("-")) , item -> Integer.parseInt(item.substring(item.indexOf("-") + 1)))));
		dto.setTotalAmout(getTotalAmout());
		return dto;
	}
}
