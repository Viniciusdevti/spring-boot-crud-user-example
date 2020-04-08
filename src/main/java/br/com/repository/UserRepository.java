package br.com.simplegym.simplegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.simplegym.simplegym.entity.User;
 
public interface UserRepository extends JpaRepository <User, Integer> {

}
