package persistence;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "donhang")
public class Order {

	@Id
	@Column(name = "MaDH")
	private Integer id;
	
	@Column(name = "DiaChiGiaoHang")
	private String address;
	
	@Column(name = "ThoiGianDatHang")
	private LocalDateTime timeOrder;
	
	@Column(name = "TongTien")
	private Double totalMoney;
	
	@OneToMany(mappedBy = "order")
	private List<OrderDetail> orderDetail;
}
