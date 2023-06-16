package com.andrescatalogue.shopcap01code4life.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrescatalogue.shopcap01code4life.entities.Client;
import com.andrescatalogue.shopcap01code4life.repositories.ClientRepository;

@Service
public class ClientService {	
	
	@Autowired
	private ClientRepository repository;

	public List<Client> findAll() {
		return repository.findAll();
	}
}
