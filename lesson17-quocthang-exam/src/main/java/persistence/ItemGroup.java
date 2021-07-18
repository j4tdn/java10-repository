package persistence;

import java.sql.Time;

public class ItemGroup {
	private Integer id;
	private String name;
	private Time ThoiGianDatHang;

	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name, Time thoiGianDatHang) {
		super();
		this.id = id;
		this.name = name;
		ThoiGianDatHang = thoiGianDatHang;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getThoiGianDatHang() {
		return ThoiGianDatHang;
	}

	public void setThoiGianDatHang(Time thoiGianDatHang) {
		ThoiGianDatHang = thoiGianDatHang;
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + ", ThoiGianDatHang=" + ThoiGianDatHang + "]";
	}

}
