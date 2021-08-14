package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KichCoMatHang")
public class ItemSize {
	@EmbeddedId
	private Id id;
	
	@Column(name = "SoLuong")
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH", insertable = false, updatable = false)
	private Item item;
	
	@OneToMany(mappedBy = "itemSize")
	private List<Size> sizes;
	
	
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
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemSize [id=" + id + ", quantity=" + quantity + "]";
	}

	@Embeddable
	public static class Id implements Serializable{
		private static final long serialVersionUID = -5273838798764298675L;

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