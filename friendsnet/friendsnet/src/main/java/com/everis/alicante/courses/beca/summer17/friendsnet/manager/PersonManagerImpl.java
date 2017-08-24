package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PersonDAO;

public class PersonManagerImpl implements PersonManager{

	@Autowired
	private PersonDAO dao;
	
	
	
}
