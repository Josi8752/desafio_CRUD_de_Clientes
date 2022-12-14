package com.desafioCRUD.CRUD.repository;

import com.desafioCRUD.CRUD.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
