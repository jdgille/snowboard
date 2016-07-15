package com.aston.snowboard.domain.VO;

import com.aston.snowboard.domain.Snowboard;

/**
 * Created by jonagill1 on 7/6/2016.
 */
public class ProductVO {

    private Snowboard snowboard;

    public ProductVO(){}

    public Snowboard getSnowboard() {
        return snowboard;
    }

    public void setSnowboard(Snowboard snowboard) {
        this.snowboard = snowboard;
    }
}
