package persistence;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemGroupTime {
	
	private int MaMH;
	private String TenMH;
	private LocalTime ThoiGianDatHang;
	
	
}
