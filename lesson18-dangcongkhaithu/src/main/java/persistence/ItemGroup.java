package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiHang")
public class ItemGroup {
	
	public static final String GET_ALL = "GET_ALL";

	@Id
	@Column(name = "MaLoai")
	private Integer igrId;

	@Column(name = "TenLoai")
	private String name;
	
	@OneToMany(mappedBy = "itemGroup")
	private List<Item> items;

	public ItemGroup() {
	}

	public ItemGroup(Integer igrId, String name) {
		this.igrId = igrId;
		this.name = name;
	}

	public Integer getIgrId() {
		return igrId;
	}

	public void setIgrId(Integer igrId) {
		this.igrId = igrId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ItemGroup [igrId=" + igrId + ", name=" + name + ", items=" + items + "]";
	}
	
	

}