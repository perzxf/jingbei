package com.jb.model.item;

public class PageBean {
    private Integer page;
    private Integer rows;
    private String itemCoding;
    private String itemNameId;
    private String itemName;
    private String itemStartime;
    private String itemEndtime;
    private int itemParticipationCount;
    private String itemChannelId;
    private String itemChannel;
    private int itemStatus;

    public String getItemCoding() {
        return itemCoding;
    }

    public void setItemCoding(String itemCoding) {
        this.itemCoding = itemCoding;
    }

    public String getItemNameId() {
        return itemNameId;
    }

    public void setItemNameId(String itemNameId) {
        this.itemNameId = itemNameId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemStartime() {
        return itemStartime;
    }

    public void setItemStartime(String itemStartime) {
        this.itemStartime = itemStartime;
    }

    public String getItemEndtime() {
        return itemEndtime;
    }

    public void setItemEndtime(String itemEndtime) {
        this.itemEndtime = itemEndtime;
    }

    public int getItemParticipationCount() {
        return itemParticipationCount;
    }

    public void setItemParticipationCount(int itemParticipationCount) {
        this.itemParticipationCount = itemParticipationCount;
    }

    public String getItemChannelId() {
        return itemChannelId;
    }

    public void setItemChannelId(String itemChannelId) {
        this.itemChannelId = itemChannelId;
    }

    public String getItemChannel() {
        return itemChannel;
    }

    public void setItemChannel(String itemChannel) {
        this.itemChannel = itemChannel;
    }

    public int getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(int itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
