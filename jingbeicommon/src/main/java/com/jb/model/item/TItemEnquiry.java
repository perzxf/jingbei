package com.jb.model.item;


public class TItemEnquiry {

  private String itemCoding;
  private String itemNameId;
  private String itemName;
  private String itemStartime;
  private String itemEndtime;
  private int itemParticipationCount;
  private String itemChannelId;
  private String itemChannel;
  private int itemStatus;
  private int itemstarstatus;


  public int getItemstarstatus() {
    return itemstarstatus;
  }

  public void setItemstarstatus(int itemstarstatus) {
    this.itemstarstatus = itemstarstatus;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemChannel() {
    return itemChannel;
  }

  public void setItemChannel(String itemChannel) {
    this.itemChannel = itemChannel;
  }

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

  public int getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(int itemStatus) {
    this.itemStatus = itemStatus;
  }
}
