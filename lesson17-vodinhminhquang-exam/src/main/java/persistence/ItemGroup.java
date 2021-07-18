package persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemGroup {

	private int MaLoai;
	private String TenLoai;
	private int MaMH;
	private String TenMH;
	private Integer GiaBan;
	private Integer GiaMua;
	private Integer SoLuon;

}
