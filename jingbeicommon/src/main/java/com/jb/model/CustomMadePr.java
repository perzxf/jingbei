package com.jb.model;


public class CustomMadePr {

  private String id; //项目编码
  private String billOfMaterialsId; //材料单ID
  private String typeId; //状态ID
  private String time; //报价结束时间
  private Integer orderSize; //采购数量

  private String bomName; //项目名称
  private String ttName; //状态
  private String tcName; //渠道名称
  private String tcId; //渠道ID
  private String materialId; //物料Id
  private String serviceId; //服务报价Id
  private String annexId; //附件id
  private Integer status; //状态 （买家1 卖家2 服务商3）

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getMaterialId() {
    return materialId;
  }

  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }

  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public String getAnnexId() {
    return annexId;
  }

  public void setAnnexId(String annexId) {
    this.annexId = annexId;
  }

  public String getTcId() {
    return tcId;
  }

  public void setTcId(String tcId) {
    this.tcId = tcId;
  }

  public String getBomName() {
    return bomName;
  }

  public void setBomName(String bomName) {
    this.bomName = bomName;
  }

  public String getTtName() {
    return ttName;
  }

  public void setTtName(String ttName) {
    this.ttName = ttName;
  }

  public String getTcName() {
    return tcName;
  }

  public void setTcName(String tcName) {
    this.tcName = tcName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getBillOfMaterialsId() {
    return billOfMaterialsId;
  }

  public void setBillOfMaterialsId(String billOfMaterialsId) {
    this.billOfMaterialsId = billOfMaterialsId;
  }


  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  public Integer getOrderSize() {
    return orderSize;
  }

  public void setOrderSize(Integer orderSize) {
    this.orderSize = orderSize;
  }

}
