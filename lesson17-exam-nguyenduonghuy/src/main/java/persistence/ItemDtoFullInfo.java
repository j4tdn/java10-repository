package persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDtoFullInfo {
	private Integer igrId;
	private String igrName;
	private Integer id;
	private String name;
	private Integer saleOut;
	private Integer saleIn;
	private Integer quantity;
}
