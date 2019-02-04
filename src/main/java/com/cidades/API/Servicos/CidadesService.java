package com.cidades.API.Servicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cidades.API.Model.Cidade;
import com.cidades.API.Repositorios.CidadesRepository;

@Service
public class CidadesService {
	
	@Autowired
	CidadesRepository cidadesRepository;
	
	public void carregarCidades() {
				
		List<Cidade> cidades = new ArrayList<Cidade>();
		cidades.add(new Cidade("3548500","SP","Santos","",-46.3313708492,-23.9337375,"antos","","Santos","Metropolitana de So Paulo"));
		cidades.add(new Cidade("3550308","SP","So Paulo","true",-46.5703831821,-23.5673865,"ao Paulo","","So Paulo","Metropolitana de So Paulo"));
		cidades.add(new Cidade("3304557","RJ","Rio de Janeiro","true",-43.227875125,-22.8766521182,"Rio de Janeiro","","Rio de Janeiro","Metropolitana do Rio de Janeiro"));
		cidades.add(new Cidade("3205309","ES","Vitria","true",-40.3222087267,-20.3201537929,"Vitoria","","Vitria","Central Esprito-Santense"));
		cidades.add(new Cidade("3106705","MG","Betim","",-44.1975511033,-19.9653792401,"Betim","","Belo Horizonte","Metropolitana de Belo Horizonte"));
		cidades.add(new Cidade("3106200","MG","Belo Horizonte","true",-43.9264531735,-19.9375242938,"Belo Horizonte","","Belo Horizonte","Metropolitana de Belo Horizonte"));
		cidades.add(new Cidade("2913606","BA","Ilhus","",-39.0431842869,-14.7933202697,"Ilheus","","Ilhus-Itabuna","Sul Baiano"));
		cidades.add(new Cidade("2807204","SE","Siriri","",-37.1122253408,-10.6050355731,"Siriri","","Cotinguiba","Leste Sergipano"));
		cidades.add(new Cidade("1717503","TO","Pium","",-49.1666580116,-10.4409311179,"Pium","","Rio Formoso","Ocidental do Tocantins"));
		cidades.add(new Cidade("1100106","RO","Guajar-Mirim","",-65.3239518197,-10.7738837407,"Guajara-Mirim","","Guajar-Mirim","Madeira-Guapor"));
		cidades.add(new Cidade("5219001","GO","Sanclerlndia","",-50.3158669331,-16.2006630829,"Sanclerlandia","","Anicuns","Centro Goiano"));
		cidades.add(new Cidade("5105622","MT","Mirassol D'Oeste","",-58.097903569,-15.6740707811,"Mirassol D'Oeste","","Jauru","Sudoeste Mato-Grossense"));
		cidades.add(new Cidade("5217708","GO","Pontalina","",-49.4481810162,-17.5149844215,"Pontalina","","Meia Ponte","Sul Goiano"));
		cidades.add(new Cidade("4106902","PR","Curitiba","true",-49.2718478851,-25.432956,"Critiba","","Curitiba","Metropolitana de Curitiba"));
		cidades.add(new Cidade("4205407","SC","Florianpolis","true",-48.5476373782,-27.5877955486,"Florianopolis","","Florianpolis","Grande Florianpolis"));
		cidades.add(new Cidade("4314902","RS","Porto Alegre","true",-51.2286604637,-30.0300367748,"Porto Alegre","","Porto Alegre","Metropolitana de Porto Alegre"));
		
		cidadesRepository.saveAll(cidades);
	}

}
