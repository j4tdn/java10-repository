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
@Table(name = "loaihang")

@NamedQueries({ @NamedQuery(name = "Get_ALL", query = "From ItemGroup") })
public class ItemGroup {
	public static final String Get_ALL ="Get_ALL";
	
	@Id
	@Column(name = "Maloai")
	private Integer igrId;
	@Column(name = "tenloai")
	private String name;
	//default: FetchType.LAZY
	@OneToMany(mappedBy = "itemGroup",fetch = FetchType.LAZY)
	private List<Item> items;
	
	public ItemGroup() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroup(Integer igrId, String name) {
		super();
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
