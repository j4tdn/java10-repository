package persistence;

import java.sql.Time;

public class ItemSaleGroup {
	public static final String ID = "MaMH";
	public static final String NAME = "TenMH";
	public static final String TIME = "timeOrder";
	
	private Integer MaMH;
	private String TenMH;
	private Time timeOrder;
	public ItemSaleGroup() {
		// TODO Auto-generated constructor stub
	}
	public ItemSaleGroup(Integer maMH, String tenMH, Time timeOrder) {
		super();
		MaMH = maMH;
		TenMH = tenMH;
		this.timeOrder = timeOrder;
	}
	public Integer getMaMH() {
		return MaMH;
	}
	public void setMaMH(Integer maMH) {
		MaMH = maMH;
	}
	public String getTenMH() {
		return TenMH;
	}
	public void setTenMH(String tenMH) {
		TenMH = tenMH;
	}
	public Time getTimeOrder() {
		return timeOrder;
	}
	public void setTimeOrder(Time timeOrder) {
		this.timeOrder = timeOrder;
	}
	public static String getId() {
		return ID;
	}
	public static String getName() {
		return NAME;
	}
	public static String getTime() {
		return TIME;
	}
	@Override
	public String toString() {
		return "ItemSaleGroup [MaMH=" + MaMH + ", TenMH=" + TenMH + ", timeOrder=" + timeOrder + "]";
	}
	
}
