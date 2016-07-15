package com.aston.snowboard.rest;

import com.aston.snowboard.domain.Snowboard;
import com.aston.snowboard.services.SnowboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jonagill1 on 7/12/2016.
 */

@RestController
@RequestMapping("/snowboard")
public class SnowboardRest {

    @Autowired
    SnowboardService snowboardService;

    @RequestMapping("/list_rocker")
    public Iterable<Snowboard> listAllRockerBoards(){
        return snowboardService.listAllRockerBoards();
    }

    @RequestMapping(value = "/like/{id}", method = RequestMethod.POST)
    public Integer likeCountIncrement(@PathVariable int id){

        Snowboard snowboard = snowboardService.getSnowboardById(id);

        if(snowboard.getLikeCount()== null)
            snowboard.setLikeCount(0);

        snowboard.setLikeCount(snowboard.getLikeCount() + 1);

        snowboardService.saveSnowboard(snowboard);

        return  snowboard.getLikeCount();
    }

    @RequestMapping(value = "/dislike/{id}", method = RequestMethod.POST)
    public Integer dislikeCountIncrement(@PathVariable int id){
        Snowboard snowboard = snowboardService.getSnowboardById(id);

        if(snowboard.getDislikeCount()== null)
            snowboard.setDislikeCount(0);

        snowboard.setDislikeCount(snowboard.getDislikeCount() + 1);

        snowboardService.saveSnowboard(snowboard);

        return snowboard.getDislikeCount();
    }



}
