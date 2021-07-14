package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Staff {
	private Integer id;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String password;
}
