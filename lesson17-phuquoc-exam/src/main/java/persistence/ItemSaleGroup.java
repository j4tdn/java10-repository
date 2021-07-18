package persistence;

import java.sql.Time;
import java.time.LocalTime;

public class ItemSaleGroup {
	private Integer MaMH;
	private String TenMH;
	private LocalTime timeOrder;
	public ItemSaleGroup() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("deprecation")
	public ItemSaleGroup(Integer maMH, String tenMH, Time timeOrder) {
		super();
		MaMH = maMH;
		TenMH = tenMH;
		this.timeOrder = LocalTime.of(timeOrder.getHours(), timeOrder.getMinutes(), timeOrder.getSeconds());
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
	public LocalTime getTimeOrder() {
		return timeOrder;
	}
	public void setTimeOrder(LocalTime timeOrder) {
		this.timeOrder = timeOrder;
	}
	@Override
	public String toString() {
		return "ItemSaleGroup [MaMH=" + MaMH + ", TenMH=" + TenMH + ", timeOrder=" + timeOrder + "]";
	}
	
	
	
}
