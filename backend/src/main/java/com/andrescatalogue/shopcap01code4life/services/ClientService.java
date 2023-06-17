package com.andrescatalogue.shopcap01code4life.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andrescatalogue.shopcap01code4life.dto.ClientDTO;
import com.andrescatalogue.shopcap01code4life.entities.Client;
import com.andrescatalogue.shopcap01code4life.repositories.ClientRepository;
import com.andrescatalogue.shopcap01code4life.services.exceptions.EntityNotFoundException;

@Service
public class ClientService {	
	
	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		
		/*
		List<ClientDTO> listDto = new ArrayList<>();
		for (Client cl : list) {
			listDto.add(new ClientDTO(cl));
		}
		
		return listDto;
		*/
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new ClientDTO(entity);
	}

	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity = new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		entity = repository.save(entity);
		return new ClientDTO(entity);
	}
}
