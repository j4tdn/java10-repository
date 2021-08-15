package persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemGroupDto {

	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String TOTAL_AMOUNT = "totalAmount";

	private Integer id;
	private String name;
	private Integer totalAmount;

}
