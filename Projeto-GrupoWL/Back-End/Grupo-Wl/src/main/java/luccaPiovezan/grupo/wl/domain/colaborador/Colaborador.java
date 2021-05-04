package luccaPiovezan.grupo.wl.domain.colaborador;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import luccaPiovezan.grupo.wl.domain.usuario.Usuario;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
public class Colaborador extends Usuario{

	private String comidas;
	
	private String bebidas;
	
	private String frios;
}
