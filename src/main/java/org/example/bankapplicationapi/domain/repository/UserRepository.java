package org.example.bankapplicationapi.domain.repository;

import org.example.bankapplicationapi.domain.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
