package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Staff {
	private int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	private String password;
}
