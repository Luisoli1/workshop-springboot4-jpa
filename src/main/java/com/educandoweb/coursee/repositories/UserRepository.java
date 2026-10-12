package com.educandoweb.coursee.repositories;

import com.educandoweb.coursee.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
