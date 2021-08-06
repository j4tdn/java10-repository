package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KichCo")
public class Size {
	
	@Id
	@Column(name = "MaKC")
	private String id;
	
	@Column(name =  "MoTa")
	private String description;
	
	/*
	 * @ManyToMany(mappedBy = "sizes") private List<Item> items;
	 */
	
	public Size() {
	}
	
	public Size(String id, String description) {
		this.id = id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
//	public List<Item> getItems() {
//		return items;
//	}
	

	@Override
	public String toString() {
		return "Size [id=" + id + ", description=" + description + "]";
	}
}
