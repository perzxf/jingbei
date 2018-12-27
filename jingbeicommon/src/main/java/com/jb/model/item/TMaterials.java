package com.jb.model.item;


public class TMaterials {
  private Integer page;
  private Integer rows;
  private String materialsid;
  private String materialsNameId;
  private String materialsName;
  private String materialsChannelId;
  private String materialsChannel;
  private String materialsSaveDate;

  public String getMaterialsid() {
    return materialsid;
  }

  public void setMaterialsid(String materialsid) {
    this.materialsid = materialsid;
  }

  public String getMaterialsName() {
    return materialsName;
  }

  public void setMaterialsName(String materialsName) {
    this.materialsName = materialsName;
  }

  public String getMaterialsChannel() {
    return materialsChannel;
  }

  public void setMaterialsChannel(String materialsChannel) {
    this.materialsChannel = materialsChannel;
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

  public String getMaterialsNameId() {
    return materialsNameId;
  }

  public void setMaterialsNameId(String materialsNameId) {
    this.materialsNameId = materialsNameId;
  }

  public String getMaterialsChannelId() {
    return materialsChannelId;
  }

  public void setMaterialsChannelId(String materialsChannelId) {
    this.materialsChannelId = materialsChannelId;
  }

  public String getMaterialsSaveDate() {
    return materialsSaveDate;
  }

  public void setMaterialsSaveDate(String materialsSaveDate) {
    this.materialsSaveDate = materialsSaveDate;
  }
}
