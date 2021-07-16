package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoaiHang {
	private int MaLoai;
	private String TenLoai;

	public static LoaiHang transfer(String line) {
		// 21, Nón
		String[] tmps = line.split(", ");
		if (tmps.length != 2) {
			return null;
		}
		return new LoaiHang(Integer.parseInt(tmps[0]), tmps[1]);
	}
}
