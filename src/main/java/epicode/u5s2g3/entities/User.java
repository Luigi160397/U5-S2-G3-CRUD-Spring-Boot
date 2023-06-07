package epicode.u5s2g3.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
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

	public User(String username, String nome, String email, String password) {
		super();
		this.username = username;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

}
