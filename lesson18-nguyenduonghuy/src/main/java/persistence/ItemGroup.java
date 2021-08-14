package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LoaiHang")
public class ItemGroup {

	@Id
	@Column(name = "MaLoai")
	private Integer id;
	
	@Column(name = "TenLoai")
	private String name;
	
	@OneToMany(mappedBy = "itemGroup")
	@ToString.Exclude private List<Item> items;
}
