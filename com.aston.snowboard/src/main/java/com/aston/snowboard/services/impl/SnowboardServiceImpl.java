package com.aston.snowboard.services.impl;

import com.aston.snowboard.domain.BoardType;
import com.aston.snowboard.domain.Snowboard;
import com.aston.snowboard.repositories.SnowboardRepository;
import com.aston.snowboard.services.SnowboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Service
public class SnowboardServiceImpl implements SnowboardService{

    @Autowired
    private SnowboardRepository snowboardRepository;

    @Override
    public Iterable<Snowboard> listAllSnowboards() {
        return snowboardRepository.findAll();
    }

    @Override
    public Snowboard getSnowboardById(Integer id) {
        return snowboardRepository.findOne(id);
    }

    @Override
    public Snowboard saveSnowboard(Snowboard snowboard) {
        return snowboardRepository.save(snowboard);
    }

    @Override
    public List<Snowboard>  saveSnowboardList(List<Snowboard> snowboardList) {
        Iterable<Snowboard> snowboardIterable = snowboardRepository.save((Iterable) snowboardList);
        return (List) snowboardIterable;
    }

    @Override
    public void deleteSnowboard(Integer id) {
        snowboardRepository.delete(id);
    }

    @Override
    public Iterable<Snowboard> listAllRockerBoards() {
        Iterable<Snowboard> snowboardIterable = snowboardRepository.findByBoardType(BoardType.rocker);
        return snowboardIterable;
    }

    @Override
    public Iterable<Snowboard> listAllCamberBoards() {
        Iterable<Snowboard> snowboardIterable = snowboardRepository.findByBoardType(BoardType.camber);
        return snowboardIterable;
    }

    @Override
    public Iterable<Snowboard> listAllComboBoards() {
        Iterable<Snowboard> snowboardIterable = snowboardRepository.findByBoardType(BoardType.combo);
        return snowboardIterable;
    }
}
