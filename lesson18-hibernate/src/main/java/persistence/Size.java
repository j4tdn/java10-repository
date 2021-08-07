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

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "KichCo")
public class Size {
	@Id
	@Column(name = "MaKC")
	private String id;
	
	@Column(name =  "MoTa")
	private String description;
	
	@OneToMany(mappedBy = "size")
	private List<ItemSize> itemSizes;
}
