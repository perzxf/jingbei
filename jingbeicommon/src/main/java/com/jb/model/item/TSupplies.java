package com.jb.model.item;


public class TSupplies {

  private String tSuppliesId;
  private String tTypeId;
  private String tTypeName;
  private String tSuppliesName;
  private String tSuppliesNames;
  private Integer tSuppliesCount;

  public String gettTypeName() {
    return tTypeName;
  }

  public void settTypeName(String tTypeName) {
    this.tTypeName = tTypeName;
  }

  public String gettSuppliesId() {
    return tSuppliesId;
  }

  public void settSuppliesId(String tSuppliesId) {
    this.tSuppliesId = tSuppliesId;
  }

  public String gettTypeId() {
    return tTypeId;
  }

  public void settTypeId(String tTypeId) {
    this.tTypeId = tTypeId;
  }

  public String gettSuppliesName() {
    return tSuppliesName;
  }

  public void settSuppliesName(String tSuppliesName) {
    this.tSuppliesName = tSuppliesName;
  }

  public String gettSuppliesNames() {
    return tSuppliesNames;
  }

  public void settSuppliesNames(String tSuppliesNames) {
    this.tSuppliesNames = tSuppliesNames;
  }

  public Integer gettSuppliesCount() {
    return tSuppliesCount;
  }

  public void settSuppliesCount(Integer tSuppliesCount) {
    this.tSuppliesCount = tSuppliesCount;
  }
}
