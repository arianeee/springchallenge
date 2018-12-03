package com.wildcodeschool.example.springHibernateChallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.example.springHibernateChallenge.entities.User;


@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
