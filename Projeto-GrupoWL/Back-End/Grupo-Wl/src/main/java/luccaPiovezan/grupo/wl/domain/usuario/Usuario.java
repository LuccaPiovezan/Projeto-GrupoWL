package luccaPiovezan.grupo.wl.domain.usuario;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class Usuario implements Serializable {

	private String nome;
	
	@EqualsAndHashCode.Include
	@Id
	private Integer cpf;
	private String senha;
	private String matricula;
	private String setor;
}
