package epicode.u5s2g3.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "edifici")
public class Edificio {

	@Id
	@GeneratedValue
	private UUID id;
	private String nome;
	private String indirizzo;

	@ManyToOne
	private Citta citta;

	public Edificio(String nome, String indirizzo, Citta citta) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}

}
