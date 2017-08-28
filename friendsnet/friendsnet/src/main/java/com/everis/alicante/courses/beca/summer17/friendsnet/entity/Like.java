package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.LikeType;

@Entity(name="LikeTable")
public class Like implements FNEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Date creationDate;
	
	private LikeType type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public LikeType getType() {
		return type;
	}

	public void setType(LikeType type) {
		this.type = type;
	}
	
}
