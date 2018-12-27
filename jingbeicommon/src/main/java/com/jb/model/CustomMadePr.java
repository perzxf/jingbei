package com.jb.model;


public class CustomMadePr {

  private Integer page;
  private Integer rows;

  private String id; //项目编码
  private String billOfMaterialsId; //材料单ID
  private String typeId; //状态ID
  private String startime;//开始时间
  private String time; //报价结束时间
  private Integer orderSize; //采购数量
  private Integer itemstarstatus; //买家状态

  private String bomName; //项目名称  //材料单名称
  private String ttName; //状态
  private String tcName; //渠道名称
  private String tcId; //渠道ID
  private String materialId; //物料Id
  private String serviceId; //服务报价Id
  private String annexId; //附件id
  private Integer status; //状态 （买家1 卖家2 服务商3）


//===========================以下是你陈爸爸加的==================================
  private String billTime;//材料单保存时间

  private String category;         //类目
  private String materialname;     //物类名称
  private String materialnumber;   //物类编号
  private Integer count;           //数量
  private String brand;            //品牌
  private Integer unitprice;       //单价
  private String name;//服务名称
  private String price;//价格

  public Integer getItemstarstatus() {
    return itemstarstatus;
  }

  public void setItemstarstatus(Integer itemstarstatus) {
    this.itemstarstatus = itemstarstatus;
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

  public String getStartime() {
    return startime;
  }

  public void setStartime(String startime) {
    this.startime = startime;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getMaterialname() {
    return materialname;
  }

  public void setMaterialname(String materialname) {
    this.materialname = materialname;
  }

  public String getMaterialnumber() {
    return materialnumber;
  }

  public void setMaterialnumber(String materialnumber) {
    this.materialnumber = materialnumber;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Integer getUnitprice() {
    return unitprice;
  }

  public void setUnitprice(Integer unitprice) {
    this.unitprice = unitprice;
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

  public String getBillTime() {
    return billTime;
  }

  public void setBillTime(String billTime) {
    this.billTime = billTime;
  }

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
