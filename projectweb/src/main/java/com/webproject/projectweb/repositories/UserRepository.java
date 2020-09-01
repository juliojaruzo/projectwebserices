package com.webproject.projectweb.repositories;

import com.webproject.projectweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
