package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Post;

@Service
public class PostManagerImpl implements PostManager {

    @Autowired
    PostDAO dao;

    //FALTA RELLENAR
    @Override
    public Post addLike(Like like) {
        return null;
    }

    @Override
    public Iterable<Post> findAll() {
        return null;
    }

    @Override
    public Post findById(Long aLong) {
        return null;
    }

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public Iterable<Post> save(Iterable<Post> posts) {
        return null;
    }

    @Override
    public Post update(Post post) {
        return null;
    }

    @Override
    public Iterable<Post> update(Iterable<Post> posts) {
        return null;
    }

    @Override
    public void remove(Post post) {

    }
}