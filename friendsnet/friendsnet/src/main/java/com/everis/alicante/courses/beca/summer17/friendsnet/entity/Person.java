package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Entity;

@Entity
public class Person implements FNEntity{
	
	private Long id;
	
	private String name;
	
	private String surname;
	
	private byte[] picture;

}
