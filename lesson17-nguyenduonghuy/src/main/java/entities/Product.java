package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private Integer id;
	private String name;
	private String color;
	private String material;
	private Double saleOut;
	private Double saleIn;
	private String image;
	private Integer categoryId;
}
