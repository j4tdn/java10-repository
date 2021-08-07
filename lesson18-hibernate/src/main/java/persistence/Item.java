package persistence;

import java.util.List;

import javax.persistence.CascadeType;
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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MatHang")
public class Item {
	
	@Id
	@Column(name = "MaMH")
	private Integer id;
	
	@Column(name = "TenMH")
	private String name;
	
	@Column(name = "Mausac")
	private String color;
	
	@Column(name = "ChatLieu")
	private String material;
	
	@Column(name = "GiaBan")
	private Double saleOut;
	
	@Column(name = "GiaMua")
	private Double saleIn;
	
	@Column(name = "HinhAnh")
	private String image;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;
	
	@OneToMany(mappedBy = "item")
	private List<ItemSize> itemSizes;
}
