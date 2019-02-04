package com.cidades.API.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cidades.API.Model.Cidade;
import com.cidades.API.Repositorios.CidadesRepository;
import com.cidades.API.Servicos.CidadesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cidades")
@Api(value = "API rest Cidades")
public class CidadesController {

	@Autowired
	private CidadesService cidadesService;
	@Autowired
	private CidadesRepository cidadesRepository;

	@GetMapping(value = "/todas")
	@ApiOperation(value = "Trás todas as cidades cadastradas")
	public List<Cidade> buscarTodas() {

		return cidadesRepository.findAll();
	}

	@RequestMapping(value = "/quantidade", method = RequestMethod.GET)
	@ApiOperation(value = "Trás a quantidade de cidades")
	public Long quantidadeCidades() {

		return cidadesRepository.count();
	}

	@GetMapping(value = "/cargaCidades")
	@ApiOperation(value = "Carregar cidades")
	public List<Cidade> carregarCidades() {

		cidadesService.carregarCidades();
		return buscarTodas();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Remove uma cidade pelo id")
	public void removeCidade(@PathVariable final Long id) {

		cidadesRepository.deleteById(id);
	}

	@RequestMapping(value = "/igbe_id/{ibge_id}", method = RequestMethod.GET)
	@ApiOperation(value = "Trás uma cidade pelo ibge_id")
	public Cidade buscarCidadePeloIbgeId(@PathVariable final String ibge_id) {

		return cidadesRepository.buscarCidadePeloIbgeId(ibge_id);
	}

	@RequestMapping(value = "/estado/{uf}", method = RequestMethod.GET)
	@ApiOperation(value = "Trás as cidade de um Estado")
	public List<String> cidadesDoEstado(@PathVariable final String uf) {

		return cidadesRepository.cidadesDoEstado(uf);
	}

	@GetMapping(value = "/capitais")
	@ApiOperation(value = "Consulta todas as capitais ordenadas por nome")
	public List<Cidade> buscarCapitais() {

		return cidadesRepository.buscarCapitais();
	}

	@GetMapping(value = "/nome/{nome}")
	@ApiOperation(value = "Trás uma cidades pelo nome")
	public Cidade buscarPeloNome(@PathVariable final String nome) {

		return cidadesRepository.buscarPeloNome(nome);
	}
}
