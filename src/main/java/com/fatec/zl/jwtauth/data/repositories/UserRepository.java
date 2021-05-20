package com.fatec.zl.jwtauth.data.repositories;

import com.fatec.zl.jwtauth.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUsersByUsername(String username);
}
