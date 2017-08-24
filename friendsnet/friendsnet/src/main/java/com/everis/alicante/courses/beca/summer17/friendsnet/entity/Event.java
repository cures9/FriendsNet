package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

public class Event implements FNEntity{

	private Long id;
	
	private String name;
	
	private Date startingDate;
	
	private Date endingDate;
	
	private EventType type;
	
	private byte[] picture;
	
}
