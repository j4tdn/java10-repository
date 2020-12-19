package Ex04;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<People> list = new ArrayList<>();

	public Manager() {
		
	}

	public List<People> getList() {
		return list;
	}

	public void setList(List<People> list) {
		this.list = list;
	}
	
	void add(People p) {
		list.add(p);
	}
	
	void display() {
		for (People person : list) {
			System.out.println(person);
		}
	}
	
	void displaySalary() {
		for (People person : list) {
			if (person instanceof GiamDoc) {
				System.out.println("Giám đốc: " + person.getHoTen() + " Lương: " + person.getLuong());
			}
			if (person instanceof TruongPhong) {
				System.out.println("Trưởng phòng: " + person.getHoTen() + " Lương: " + person.getLuong());
			}
			if (person instanceof NhanVien) {
				System.out.println("Nhân viên: " + person.getHoTen() + " Lương: " + person.getLuong());
			}
		}
	}
}
