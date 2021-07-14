package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CategoryDto {
	private Integer categoryId;
	private String categoryName;
	private String productList;
	private Integer totalQuantity;
}
