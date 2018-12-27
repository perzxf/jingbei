package com.jb.model.item;

import lombok.Data;

@Data
public class PageBean {
    private Integer page;
    private Integer rows;
    private String itemCoding;
    private String id;
    private String itemNameId;
    private String itemName;
    private String itemStartime;
    private String itemEndtime;
    private int itemParticipationCount;
    private String itemChannelId;
    private String itemChannel;
    private int itemStatus;
    private int itemstarstatus;


}
