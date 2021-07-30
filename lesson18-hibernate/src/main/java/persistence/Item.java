package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@Column(name = "MauSac")
	private String color;

	@Column(name = "ChatLieu")
	private String material;

	@Column(name = "GiaMua")
	private Double salesIn;

	@Column(name = "GiaBan")
	private Double SalesOut;

	@Column(name = "HinhAnh")
	private String image;
	
	
	@ManyToOne
	// name: foreign key's name của bảng
	// referencedColumnName: khóa chính của bảng
	// đang được tham chiếu tới 
	@JoinColumn(name = "MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;

}
