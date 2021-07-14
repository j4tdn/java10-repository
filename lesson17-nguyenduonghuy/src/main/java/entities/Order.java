package entities;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
	private Integer id;
	private String address;
	private String phone;
	private Integer ship;
	private Date date;
	private Double total;
	private Integer customerId;
	private Integer staffId;
	private Integer paymentId;
}
