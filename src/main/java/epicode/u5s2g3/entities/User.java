package epicode.u5s2g3.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
	private UUID id;
	private String username;
	private String nome;
	private String email;
	private Boolean active = true;

	private String password;

}
