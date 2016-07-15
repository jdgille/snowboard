package com.aston.snowboard.domain;

import javax.persistence.*;

/**
 * Created by jonagill1 on 6/27/2016.
 */

@Entity
public class Snowboard extends Product{

    private String  boardName;
    private String  length;
    private String  photo;
    private Integer likeCount;
    private Integer dislikeCount;

    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    public Snowboard(){}

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public BoardType getBoardType() {
        return boardType;
    }

    public void setBoardType(BoardType boardType) {
        this.boardType = boardType;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }
}
