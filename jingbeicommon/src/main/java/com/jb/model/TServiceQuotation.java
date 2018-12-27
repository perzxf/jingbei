package com.jb.model;


public class TServiceQuotation {

  private String id;
  private String name;//服务名称
  private String price;//价格
  private String customMadePrId;//定制比价管理Id
  private String status;//状态

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public String getCustomMadePrId() {
    return customMadePrId;
  }

  public void setCustomMadePrId(String customMadePrId) {
    this.customMadePrId = customMadePrId;
  }

}
