package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "MatHang")
public class Item {

	@Id
	@Column(name = "MaMH")
	private Integer id;

	@Column(name = "TenMH")
	private String name;

	@Column(name = "GiaBan")
	private Double saleOut;

	@Column(name = "GiaMua")
	private Double saleIn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;

	@OneToMany(mappedBy = "item")
	@ToString.Exclude
	private List<ItemSize> itemSizes;

	@OneToMany(mappedBy = "item")
	@ToString.Exclude
	private List<BillDetail> billDetails;

}
