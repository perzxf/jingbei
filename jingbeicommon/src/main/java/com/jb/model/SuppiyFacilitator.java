package com.jb.model;


public class SuppiyFacilitator {

  private String xiangmuid; //主键
  private String xiangbian;
  private String xiangname; //名称
  private String qudaoid;
  private String statusdate;
  private String stopdate;
  private Integer zhuangtai;
  private String fujian;
  private String text;  //上传

  public String getXiangmuid() {
    return xiangmuid;
  }

  public void setXiangmuid(String xiangmuid) {
    this.xiangmuid = xiangmuid;
  }

  public String getXiangbian() {
    return xiangbian;
  }

  public void setXiangbian(String xiangbian) {
    this.xiangbian = xiangbian;
  }

  public String getXiangname() {
    return xiangname;
  }

  public void setXiangname(String xiangname) {
    this.xiangname = xiangname;
  }

  public String getQudaoid() {
    return qudaoid;
  }

  public void setQudaoid(String qudaoid) {
    this.qudaoid = qudaoid;
  }

  public String getStatusdate() {
    return statusdate;
  }

  public void setStatusdate(String statusdate) {
    this.statusdate = statusdate;
  }

  public String getStopdate() {
    return stopdate;
  }

  public void setStopdate(String stopdate) {
    this.stopdate = stopdate;
  }

  public Integer getZhuangtai() {
    return zhuangtai;
  }

  public void setZhuangtai(Integer zhuangtai) {
    this.zhuangtai = zhuangtai;
  }

  public String getFujian() {
    return fujian;
  }

  public void setFujian(String fujian) {
    this.fujian = fujian;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "SuppiyFacilitator{" +
            "xiangmuid='" + xiangmuid + '\'' +
            ", xiangbian='" + xiangbian + '\'' +
            ", xiangname='" + xiangname + '\'' +
            ", qudaoid='" + qudaoid + '\'' +
            ", statusdate='" + statusdate + '\'' +
            ", stopdate='" + stopdate + '\'' +
            ", zhuangtai=" + zhuangtai +
            ", fujian='" + fujian + '\'' +
            ", text='" + text + '\'' +
            '}';
  }
}
