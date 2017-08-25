package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

@Service
public class EventManagerImpl implements Manager{

	@Autowired
	private EventDAO dao;
	
	@Override
	public Iterable<Event> findAll() {
		return dao.findAll();
	}

	@Override
	public FNEntity findById(Serializable id) {
		return null;
	}

	@Override
	public FNEntity save(FNEntity e) {
		return null;
	}

	@Override
	public Iterable save(Iterable es) {
		dao.save(es);
	}

	@Override
	public FNEntity update(FNEntity e) {
		return null;
	}

	@Override
	public Iterable update(Iterable es) {
		return null;
	}

	@Override
	public void remove(FNEntity e) {
		
	}

}
