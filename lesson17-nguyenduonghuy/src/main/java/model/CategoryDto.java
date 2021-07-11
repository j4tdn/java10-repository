package model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CategoryDto {
	private Integer categoryId;
	private String categoryName;
	private String productList;
	private Integer totalQuantity;
	
	public CategoryDto() {
	}

	public CategoryDto(Integer categoryId, String categoryName, String productList, Integer totalQuantity) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.productList = productList;
		this.totalQuantity = totalQuantity;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getProductList() {
		return productList;
	}

	public void setProductList(String productList) {
		this.productList = productList;
	}

	public Integer getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CategoryDto)) {
			return false;
		}
		CategoryDto that = (CategoryDto) obj;
		return new EqualsBuilder()
					.append(getCategoryId(), that.getCategoryId())
					.append(getCategoryName(), that.getCategoryName())
					.append(getProductList(), that.getProductList())
					.append(getTotalQuantity(), that.getTotalQuantity())
					.isEquals();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(getCategoryId())
					.append(getCategoryName())
					.append(getProductList())
					.append(getTotalQuantity())
					.hashCode();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append(getCategoryId())
				.append(getCategoryName())
				.append(getProductList())
				.append(getTotalQuantity())
				.toString();
	}
}
