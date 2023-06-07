package epicode.u5s2g3.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Postazione {

	@Id
	@GeneratedValue
	private UUID id;

	private String codice;
	private String descrizione;
	private Integer numeroMassimoOccupanti;

	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;

	@ManyToOne
	private Edificio edificio;

//	@OneToMany(mappedBy = "postazione")
//	@OrderBy(value = "dataPrenotata")
//	private List<Prenotazione> listaPrenotazioni;
}
