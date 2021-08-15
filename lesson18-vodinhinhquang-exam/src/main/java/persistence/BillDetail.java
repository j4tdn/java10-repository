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

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "ChiTietDonHang")
public class BillDetail {

	@EmbeddedId
	private final Id id;

	@Column(name = "SoLuong")
	private final Integer quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH", insertable = false, updatable = false)
	@ToString.Exclude
	private Item item;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaDH", referencedColumnName = "MaDH", insertable = false, updatable = false)
	@ToString.Exclude
	private Bill bill;

	@Data
	@RequiredArgsConstructor
	@NoArgsConstructor(force = true)
	@Embeddable
	public static class Id implements Serializable {

		private static final long serialVersionUID = 5570313796136641688L;

		@Column(name = "MaDH")
		private final Integer billId;

		@Column(name = "MaMH")
		private final String itemId;
	}
}
