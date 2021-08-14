package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chitietdonhang")
public class OrderDetail {
	
	@EmbeddedId
	private Id id;
	
	@Column(name = "SoLuong")
	private Integer quantity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH", insertable = false, updatable = false)
	@ToString.Exclude private Item item;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaDH", referencedColumnName = "MaDH", insertable = false, updatable = false)
	@ToString.Exclude private Order order;
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Embeddable
	public static class Id implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Column(name = "MaDH")
		private Integer orderId;
		
		@Column(name = "MaMH")
		private Integer itemId;
	}
}
