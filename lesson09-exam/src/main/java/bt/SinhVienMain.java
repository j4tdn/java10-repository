package bt;

import java.util.ArrayList;

public class SinhVienMain {
	public static void main(String[] args) {
		SinhVienAction obj = new SinhVienAction();
		ArrayList<SinhVien> list = obj.input();
		ArrayList<SinhVien> listSvLoaiA = obj.sinhVienDatLoaiA(list);
		System.out.println("========= SINH VIÊN LOẠI A ==========");
		if (listSvLoaiA.size() > 0) {
			for (SinhVien sinhVien : listSvLoaiA) {
				System.out.println(sinhVien);
			}
		}
		ArrayList<SinhVien> listSvHocLai = obj.sinhVienHocLai(list);
		System.out.println("========= SINH VIÊN HỌC LẠI ==========");
		if (listSvHocLai.size() > 0) {
			for (SinhVien sinhVien : listSvHocLai) {
				System.out.println(sinhVien);
			}
		}
	}
}