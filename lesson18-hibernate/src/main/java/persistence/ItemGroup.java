package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loaihang")
public class ItemGroup {
	
	@Id
	@Column(name = "MaLoai")
	private Integer id;
	
	@Column(name = "TenLoai")
	private String name;
}
