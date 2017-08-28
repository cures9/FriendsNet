package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Post implements FNEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    private Date creationDate;

    private PostType type;

    private byte[] picture;

    @ManyToOne
    @JoinColumn(name = "event_id")
    @JsonIgnore
    private Event postInEvent;

    @OneToMany(mappedBy = "likesByPost")
    private Set<Like> likes;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonIgnore
    private Person postByPerson;

}
