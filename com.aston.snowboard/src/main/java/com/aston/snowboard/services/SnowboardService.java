package com.aston.snowboard.services;

import com.aston.snowboard.domain.Snowboard;

import java.util.List;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface SnowboardService {

    Iterable<Snowboard> listAllSnowboards();

    Snowboard getSnowboardById(Integer id);

    Snowboard saveSnowboard(Snowboard snowboard);

    List<Snowboard> saveSnowboardList(List<Snowboard> snowboardList);

    void deleteSnowboard(Integer id);

    Iterable<Snowboard> listAllRockerBoards();

    Iterable<Snowboard> listAllCamberBoards();

    Iterable<Snowboard> listAllComboBoards();
}
