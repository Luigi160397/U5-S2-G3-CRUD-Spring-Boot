package epicode.u5s2g3.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import epicode.u5s2g3.entities.Prenotazione;
import epicode.u5s2g3.exceptions.NotFoundException;
import epicode.u5s2g3.repositories.PrenotazioniRepository;

@Service
public class PrenotazioniService {
	@Autowired
	private PrenotazioniRepository prenotazioniRepo;

	public Page<Prenotazione> find(int page, int size, String sortBy) {
		if (size < 0)
			size = 10;
		if (size > 100)
			size = 100;
		Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));

		return prenotazioniRepo.findAll(pageable);
	}

	public Prenotazione findById(UUID id) throws NotFoundException {
		return prenotazioniRepo.findById(id).orElseThrow(() -> new NotFoundException("Prenotazione non trovata!"));
	}
}
