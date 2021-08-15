package persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
@Table(name = "KichCoMatHang")
public class ItemSize {

	@EmbeddedId
	private Id id;

	@Column(name = "SoLuong")
	private Integer quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH", updatable = false, insertable = false)
	@ToString.Exclude
	private Item item;

	@Data
	@NoArgsConstructor(force = true)
	@AllArgsConstructor
	@Embeddable
	public static class Id implements Serializable {

		private static final long serialVersionUID = -8892646235709265279L;

		@Column(name = "MaMH")
		private Integer itemId;

		@Column(name = "MaKC")
		private String sizeId;

	}

}
