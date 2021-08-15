package persistence;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "DonHang")
public class Bill {

	@Id
	@Column(name = "MaDH")
	private final Integer id;

	@Column(name = "ThoiGianDatHang")
	private final LocalTime orderTime;

	@OneToMany(mappedBy = "bill")
	private List<BillDetail> billDetails;
}
