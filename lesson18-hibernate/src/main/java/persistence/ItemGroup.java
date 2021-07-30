package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "LoaiHang")

@NamedQueries({
			@NamedQuery(name = "somename", query = "FROM ItemGroup")
		}
	)
public class ItemGroup {

	@Id
	@Column(name = "MaLoai")
	private Integer igrId;

	@Column(name = "TenLoai")
	private String name;
	
	@OneToMany()
	private List<Item> items;
}
