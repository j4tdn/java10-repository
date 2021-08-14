package persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemGroupDto {
	public static String ID = "id";
	public static String NAME = "name";
	public static String TOTAL_AMOUNT = "totalAmount";
	
	private Integer id;
	private String name;
	private Integer totalAmount;
}
