package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface PersonManager {

	void findAll();

	Person findById(Long id);

	Person save(Person person);

	void remove(Object object);

}
