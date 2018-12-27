package com.jb.model;

//材料单表
public class BillOfMaterials {

  private String id;//id
  private String name;//材料单名称
  private String time;//保存时间



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


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

}
