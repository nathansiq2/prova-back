package com.cidades.API.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.cidades.API.Model.Cidade;

@Component
public interface CidadesRepository extends JpaRepository<Cidade, Long>{

	@Query("select c from Cidade c where c.name like %?1")
	Cidade buscarPeloNome(String nome);
	
	@Query("select c from Cidade c where c.ibge_id like ?1")
	Cidade buscarCidadePeloIbgeId(String ibge_id);
	
	@Query("select c.name from Cidade c where c.uf like ?1")
	List<String> cidadesDoEstado(String estado);
			
	@Query("select c from Cidade c where c.capital = 'true' order by c.name asc")
	List<Cidade> buscarCapitais();
		
}
