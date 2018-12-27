package com.jb.model;

//材料单
public class TMaterial {
  private Integer page;
  private Integer rows;
  private String id;               //主键
  private String category;         //类目
  private String materialname;     //物类名称
  private String materialnumber;   //物类编号
  private Integer count;           //数量
  private String brand;            //品牌
  private Integer unitprice;       //单价
  private String custommadeprid;   //定制比价管理id
  private String annexid;          //附件id
  private String remarks;          //描述
  private String effectivetime;    //报价有效时间
  private String supplyperiod;     //供货周期
  private Integer status;          //状态

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

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public String getCustommadeprid() {
    return custommadeprid;
  }

  public void setCustommadeprid(String custommadeprid) {
    this.custommadeprid = custommadeprid;
  }

  public String getAnnexid() {
    return annexid;
  }

  public void setAnnexid(String annexid) {
    this.annexid = annexid;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getEffectivetime() {
    return effectivetime;
  }

  public void setEffectivetime(String effectivetime) {
    this.effectivetime = effectivetime;
  }

  public String getSupplyperiod() {
    return supplyperiod;
  }

  public void setSupplyperiod(String supplyperiod) {
    this.supplyperiod = supplyperiod;
  }

  @Override
  public String toString() {
    return "TMaterial{" +
            "id='" + id + '\'' +
            ", category='" + category + '\'' +
            ", materialname='" + materialname + '\'' +
            ", materialnumber='" + materialnumber + '\'' +
            ", count=" + count +
            ", brand='" + brand + '\'' +
            ", unitprice=" + unitprice +
            ", custommadeprid='" + custommadeprid + '\'' +
            ", annexid='" + annexid + '\'' +
            ", remarks='" + remarks + '\'' +
            ", effectivetime='" + effectivetime + '\'' +
            ", supplyperiod='" + supplyperiod + '\'' +
            '}';
  }
}
