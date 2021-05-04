package luccaPiovezan.grupo.wl.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luccaPiovezan.grupo.wl.domain.colaborador.Colaborador;
import luccaPiovezan.grupo.wl.domain.colaborador.ColaboradorRepository;

@Service
public class ColaboradorService {

	@Autowired
	private ColaboradorRepository colaboradorRepository;
	
	public void saveCliente(Colaborador colaborador) {
		colaboradorRepository.save(colaborador);
	}
}
