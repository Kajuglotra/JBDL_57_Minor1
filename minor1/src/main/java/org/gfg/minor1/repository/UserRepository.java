package org.gfg.minor1.repository;

import org.gfg.minor1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByContact(String contact);
}
