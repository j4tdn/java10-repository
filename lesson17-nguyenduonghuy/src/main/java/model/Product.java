package model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Product {
	private Integer id;
	private String name;
	private String color;
	private String material;
	private Double saleOut;
	private Double saleIn;
	private String image;
	private Integer categoryId;
	
	public Product() {
	}

	public Product(Integer id, String name, String color, String material, Double saleOut, Double saleIn, String image,
			Integer categoryId) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.material = material;
		this.saleOut = saleOut;
		this.saleIn = saleIn;
		this.image = image;
		this.categoryId = categoryId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getSaleOut() {
		return saleOut;
	}

	public void setSaleOut(Double saleOut) {
		this.saleOut = saleOut;
	}

	public Double getSaleIn() {
		return saleIn;
	}
	
	public void setSaleIn(Double saleIn) {
		this.saleIn = saleIn;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product that = (Product) obj;
		return new EqualsBuilder()
					.append(getId(), that.getId())
					.append(getName(), that.getName())
					.append(getColor(), that.getColor())
					.append(getMaterial(), that.getMaterial())
					.append(getSaleOut(), that.getSaleOut())
					.append(getSaleIn(), that.getSaleIn())
					.append(getImage(), that.getImage())
					.append(getCategoryId(), that.getCategoryId())
					.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(getId())
					.append(getName())
					.append(getColor())
					.append(getMaterial())
					.append(getSaleOut())
					.append(getSaleIn())
					.append(getImage())
					.append(getCategoryId())
					.toHashCode();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
					.append(getId())
					.append(getName())
					.append(getColor())
					.append(getMaterial())
					.append(getSaleOut())
					.append(getSaleIn())
					.append(getImage())
					.append(getCategoryId())
					.toString();
	}
}
