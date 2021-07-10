package bean;

public class LoaiHang {
	private Integer id;
	private String name;
	public LoaiHang() {
		
	}
	public LoaiHang(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mã loại: "+ id+ "\nTên loại: "+name;
	}
	
}

