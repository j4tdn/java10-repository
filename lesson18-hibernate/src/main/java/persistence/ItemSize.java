package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
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
	// 1 table have 1id have n collums

	// Native class
	// should implements Serializable
	@Column(name = "SoLuong")
	private Integer quantity;
	@ManyToOne
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH", insertable = false, updatable = false)
	private Item item;

	public ItemSize() {
		// TODO Auto-generated constructor stub
	}

	public ItemSize(Id id, Integer quantity) {
		super();
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
	public static class Id implements Serializable {
		private static final long SerialVersionUID = -213213213213213L;
		@Column(name = "MaMH")
		private Integer itemId;
		@Column(name = "MaKC")
		private String sizeId;

		public Id() {
			// TODO Auto-generated constructor stub
		}

		public Id(Integer itemId, String sizeId) {
			super();
			this.itemId = itemId;
			this.sizeId = sizeId;
		}

		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", sizeId=" + sizeId + "]";
		}

	}

}
