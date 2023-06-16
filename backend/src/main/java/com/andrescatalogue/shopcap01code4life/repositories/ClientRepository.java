package com.andrescatalogue.shopcap01code4life.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrescatalogue.shopcap01code4life.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
