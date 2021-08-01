package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MatHang")
public class Item {
	@Id
	@Column(name="MaMH")
	private Integer id;
	@Column(name="TenMH")
	private String name;
	@Column(name="MauSac")
	private String color;
	@Column(name="ChatLieu")
	private String material;
	@Column(name="GiaMua")
	private Double salesIn;
	@Column(name="GiaBan")
	private Double salesOut;
	@Column(name="HinhAnh")
	private String image;
	//referencedColumnName la col bi tham chieu, la khoa chinh bang Maloai
	//name="Maloai" is FK in table MatHang
	//default: FetchType.EGEAR
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MaLoai", referencedColumnName = "MaLoai")
	private ItemGroup itemGroup;
	public Item() {

	}
	public Item(Integer id, String name, String color, String material, Double salesIn, Double salesOut, String image,
			ItemGroup itemGroup) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.material = material;
		this.salesIn = salesIn;
		this.salesOut = salesOut;
		this.image = image;
		this.itemGroup = itemGroup;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Double getSalesIn() {
		return salesIn;
	}
	public void setSalesIn(Double salesIn) {
		this.salesIn = salesIn;
	}
	public Double getSalesOut() {
		return salesOut;
	}
	public void setSalesOut(Double salesOut) {
		this.salesOut = salesOut;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public ItemGroup getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", material=" + material + ", salesIn="
				+ salesIn + ", salesOut=" + salesOut + ", image=" + image + ", ItemGroup]";
	}
	
}
