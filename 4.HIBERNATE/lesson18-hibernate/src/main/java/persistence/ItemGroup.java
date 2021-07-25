package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loaihang")
public class ItemGroup {
	@Id
	@Column(name="maloai")
	private Integer igrId;
	@Column(name="tenloai")
	private String name;

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

	@Override
	public String toString() {
		return "ItemGroup [igrId=" + igrId + ", name=" + name + "]";
	}

}
