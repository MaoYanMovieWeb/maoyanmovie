package com.hut.maoyanmovie.service.impl;

import com.hut.maoyanmovie.bean.Actor;
import com.hut.maoyanmovie.dao.ActorMapper;
import com.hut.maoyanmovie.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author asus
 * @data 2020/12/14
 */

@Service
public class ActorServiceimpl implements ActorService {

    @Autowired
    ActorMapper actorMapper;

    @Override
    public Actor getActor(Integer mid) {
        return actorMapper.getActor(mid);
    }
}