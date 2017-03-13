package br.com.gch.back.rest.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import br.com.gch.back.rest.model.Segurado;

public class SeguradoDao {
	private static Map<String, Segurado> banco = new HashMap<String, Segurado>();
	
	static {
		long dataNascimento = 315543600000l;
		
		/*Segurados do Corretor Chelsey*/
		Segurado silvioSantos = new Segurado("12673657576", "Senor Abravanel", "silvio@sbt.com.br", new Date(dataNascimento), "Avenida Morumbi","30730365638");
		Segurado ratinho = new Segurado("69679267644", "Carlos Massa", "ratinho@sbt.com.br", new Date(dataNascimento), "Avenida Paulista","30730365638");
		Segurado lula = new Segurado("86525576679", "Luis Inacio Lula da Silva", "lula@pt.com.br", new Date(dataNascimento), "Avenida Kenedy","30730365638");
		
		/*Segurados do Corretor Bill*/
		Segurado dilma = new Segurado("94520686717", "Dilma Vana Roussef", "dilma@pt.com.br", new Date(dataNascimento), "Avenida Rio Grande do Sul","16480376668");
		Segurado carioca = new Segurado("35568534004", "Marvio Lucio", "carioca@panico.com.br", new Date(dataNascimento), "Avenida dos Estados","16480376668");
		Segurado bolsonaro = new Segurado("84402753236", "Jair Messias Bolsonaro", "jair_bolsonaro@camdeputados.gov.br", new Date(dataNascimento), "Asa Norte","16480376668");
		
		/*Segurados do Call Center Cheetah - Steve*/
		Segurado spiderMan = new Segurado("39783342088", "Peter Parker", "spider_man@marvel.com", new Date(dataNascimento), "Queens", "34209374741");
		Segurado hulk = new Segurado("11486428380", "Dr. Robert Bruce Banner", "hulk@marvel.com", new Date(dataNascimento), "Around the world", "34209374741");
		Segurado thor = new Segurado("32449785680", "Thor of Asgard", "thor@marvel.com", new Date(dataNascimento), "Asgard", "34209374741");
		
		/*Segurados do Call Center Cheetah - Mark*/
		Segurado captainAmerica = new Segurado("97315715584", "Steve Rogers", "captain_america@marvel.com", new Date(dataNascimento), "II World War", "89775811848");
		Segurado ironMan = new Segurado("82579612130", "Tony Stark", "iron_man@marvel.com", new Date(dataNascimento), "USA", "89775811848");
		Segurado venom = new Segurado("89517329830", "Eddie Brock", "venom_sk8@marvel.com", new Date(dataNascimento), "Fifth Avenue", "89775811848");
		
		/*Segurados do Call Center Horse - James*/
		Segurado darthVader = new Segurado("57933914870", "Darth Vader", "darth@starWars.com", new Date(dataNascimento), "In a galaxy far, far away", "63177531307");
		Segurado leaPrincess = new Segurado("76339221335", "Princesa Lea", "lea@starWars.com", new Date(dataNascimento), "In a galaxy far, far away", "63177531307");
		Segurado hanSolo = new Segurado("18374722894", "Han Solo", "han@starWars.com", new Date(dataNascimento), "In a galaxy far, far away", "63177531307");
		
		/*Segurados do Call Center Horse - Larry*/
		Segurado acdc = new Segurado("32368138307", "ACDC", "concert@acdc.com", new Date(dataNascimento), "USA", "78272656850");
		Segurado pinkFloyd = new Segurado("83593162105", "Pink Floyd", "pinkfloyd@floyd.com", new Date(dataNascimento), "USA", "78272656850");
		Segurado ironMaiden = new Segurado("73210726493", "Iron Maiden", "eddie@ironMaiden.com", new Date(dataNascimento), "USA", "78272656850");
		
		
		banco.put(silvioSantos.getCpf(), silvioSantos);
		banco.put(ratinho.getCpf(), ratinho);
		banco.put(lula.getCpf(), lula);
		
		banco.put(dilma.getCpf(), dilma);
		banco.put(carioca.getCpf(), carioca);
		banco.put(bolsonaro.getCpf(), bolsonaro);
		
		banco.put(spiderMan.getCpf(), spiderMan);
		banco.put(hulk.getCpf(), hulk);
		banco.put(thor.getCpf(), thor);
		
		banco.put(captainAmerica.getCpf(), captainAmerica);
		banco.put(ironMan.getCpf(), ironMan);
		banco.put(venom.getCpf(), venom);
		
		banco.put(darthVader.getCpf(), darthVader);
		banco.put(leaPrincess.getCpf(),leaPrincess);
		banco.put(hanSolo.getCpf(), hanSolo);
		
		banco.put(acdc.getCpf(), acdc);
		banco.put(pinkFloyd.getCpf(), pinkFloyd);
		banco.put(ironMaiden.getCpf(), ironMaiden);
	}
	
	public Segurado validarSegurado(String cpfSegurado, String cpfFuncResponsavel) {
		Segurado seguradoValidado = banco.get(cpfSegurado);
		
		/* Checa se o segurado primeiramente existe*/
		if (seguradoValidado != null) {
			/*Checa se o CPF do responsavel pelo segurado bate com o usuario*/
			if (seguradoValidado.getCpfFuncResponsavel().equals(cpfFuncResponsavel)) {
				return seguradoValidado;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
}
