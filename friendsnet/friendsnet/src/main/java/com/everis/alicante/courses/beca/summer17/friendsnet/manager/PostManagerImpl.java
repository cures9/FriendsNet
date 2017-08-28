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
        return dao.addLike(like);
    }

    @Override
    public Iterable<Post> findAll() {
        return dao.findAll();
    }

    @Override
    public Post findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Post save(Post post) {
        return dao.save(post);
    }

    @Override
    public Iterable<Post> save(Iterable<Post> posts) {
        return dao.save(posts);
    }

    @Override
    public Post update(Post post) {
        return dao.update(post);
    }

    @Override
    public Iterable<Post> update(Iterable<Post> posts) {
        return dao.update(posts);
    }

    @Override
    public void remove(Post e) {
    	dao.remove(e);
    }
}
