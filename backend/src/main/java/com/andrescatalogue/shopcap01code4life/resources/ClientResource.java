package com.andrescatalogue.shopcap01code4life.resources;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrescatalogue.shopcap01code4life.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		
		Instant instantOne = Instant.parse("1995-01-19T17:35:30.01Z");
		Instant instantTwo = Instant.parse("2012-07-19T17:35:30.01Z");
		Instant instantThree = Instant.parse("1975-09-19T17:35:30.01Z");
		Instant instantFour = Instant.parse("2007-06-19T17:35:30.01Z");
		Instant instantFive = Instant.parse("2007-08-19T17:35:30.01Z");
		Instant instantSix = Instant.parse("1978-10-19T17:35:30.01Z");
		Instant instantSeven = Instant.parse("1970-11-19T17:35:30.01Z");
		Instant instantEight = Instant.parse("1972-12-19T17:35:30.01Z");
		Instant instantNine = Instant.parse("1974-12-19T17:35:30.01Z");
		Instant instantTen = Instant.parse("1973-12-19T17:35:30.01Z");
		
		list.add(new Client(1L, "Catarina Isabel Marques Jesus", "7513489240", 6.000, instantOne, 0));
		list.add(new Client(2L, "Martim Ferrer da Silva Pestana", "7513698418", 6.500, instantTwo, 0));
		list.add(new Client(3L, "Andrés Ferrer de Pestana", "7513397614", 12.500, instantThree, 2));
		list.add(new Client(4L, "Daniel Alexandre Silva Antunes", "751337890", 4.500, instantFour, 0));
		list.add(new Client(5L, "Patrícia Alexandra da Silva Pestana", "7518925683", 13.500, instantFive, 2));
		list.add(new Client(6L, "Francisco Baptista Simão", "7511864683", 8.500, instantSix, 2));
		list.add(new Client(7L, "Manuel António Rodrigues dos Santos", "7511390683", 9.500, instantSeven, 4));
		list.add(new Client(8L, "Rodrigo Alexandre Lameiras", "7511397353", 10.500, instantEight, 4));
		list.add(new Client(9L, "Sandra Marques dos Santos Lameiras", "7511387353", 8.000, instantNine, 3));
		list.add(new Client(10L, "Joaquim Baluarte Traquinas", "7087397353", 9.000, instantTen, 3));
		
		return ResponseEntity.ok().body(list);
	}
}
