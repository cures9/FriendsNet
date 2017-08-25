package com.everis.alicante.courses.beca.summer17.friendsnet.dao;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

@Service
public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO{

	public Group addPersons(Group group, Iterable<Person> persons) {
		return null;
	}
}
