package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "LoaiHang")
public class ItemGroup {
	
	@Id
	@Column(name = "MaLoai")
	private Integer igrId;
	
	@Column(name = "TenLoai")
	private String name;
	
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
	@Override
	public String toString() {
		return "ItemGroup [igrId=" + igrId + ", name=" + name + "]";
	}
	

}
