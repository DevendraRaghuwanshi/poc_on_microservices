package com.learning.jpa.jpa.demo.app.service;

import com.learning.jpa.jpa.demo.app.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDaoService {

	@PersistenceContext
	private EntityManager entityManager;

	public long insertUser(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
