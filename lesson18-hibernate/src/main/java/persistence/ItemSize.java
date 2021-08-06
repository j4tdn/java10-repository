package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "KichCoMatHang")
public class ItemSize {
	@EmbeddedId
	private Id id;
	
	@Column(name= "SoLuong")
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH", insertable = false, updatable = false)
	private Item item;
	

	public ItemSize() {
	}
	
	
	public ItemSize(Id id, Integer quantity) {
		this.id = id;
		this.quantity = quantity;
	}
	
	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public Item getItem() {
		return item;
	}
	
	@Override
	public String toString() {
		return "ItemSize [id=" + id + ", quantity=" + quantity + "]";
	}

	public static class Id implements Serializable{
		private static final long serialVersionUID = 1L;

		@Column(name = "MaMH")
		private Integer itemId;
		
		@Column(name = "MaKC")
		private String sizeId;
		
		
		public Id() {
		}

		public Id(Integer itemId, String sizeId) {
			this.itemId = itemId;
			this.sizeId = sizeId;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public String getSizeId() {
			return sizeId;
		}

		public void setSizeId(String sizeId) {
			this.sizeId = sizeId;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", sizeId=" + sizeId + "]";
		}
		
		
	}
	
	
}
