package com.aston.snowboard.repositories;

import com.aston.snowboard.domain.BoardType;
import com.aston.snowboard.domain.Snowboard;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jonagill1 on 6/27/2016.
 */
public interface SnowboardRepository extends CrudRepository<Snowboard, Integer> {

    List<Snowboard> findByBoardType(BoardType boardType);
}
