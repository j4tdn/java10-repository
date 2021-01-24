package bt;

import java.util.ArrayList;

public class SinhVienAction {
	public ArrayList<SinhVien> input() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		list.add(new SinhVien(1, "Nam", XepLoai.B));
		list.add(new SinhVien(2, "Dũng", XepLoai.A));
		list.add(new SinhVien(3, "Lan", XepLoai.F));
		list.add(new SinhVien(4, "Huyền", XepLoai.A));
		list.add(new SinhVien(5, "Hà", XepLoai.F));
		list.add(new SinhVien(6, "Mạnh", XepLoai.F));
		list.add(new SinhVien(7, "Hoàng", XepLoai.C));
		list.add(new SinhVien(8, "Đạt", XepLoai.D));
		list.add(new SinhVien(9, "Quân", XepLoai.F));
		list.add(new SinhVien(10, "Hiếu", XepLoai.A));
		return list;
	}

	public ArrayList<SinhVien> sinhVienDatLoaiA(ArrayList<SinhVien> list) {
		ArrayList<SinhVien> listKq = new ArrayList<SinhVien>();
		if (list.size() > 0) {
			for (SinhVien sv : list) {
				if (sv.getXepLoai().equals(XepLoai.A)) {
					listKq.add(sv);
				}
			}
		}
		return listKq;
	}

	public ArrayList<SinhVien> sinhVienHocLai(ArrayList<SinhVien> list) {
		ArrayList<SinhVien> listKq = new ArrayList<SinhVien>();
		if (list.size() > 0) {
			for (SinhVien sv : list) {
				if (sv.getXepLoai().equals(XepLoai.F)) {
					listKq.add(sv);
				}
			}
		}
		return listKq;
	}
}
