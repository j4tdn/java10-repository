package persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemGroupStorage {

	private int MaLoai;
	private String TenLoai;
	private Integer SoLuong;

}
