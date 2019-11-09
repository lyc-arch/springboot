package com.conner.springboot.pojo;


import java.util.List;

public class ConnerUser {

  private String usId;
  private String usName;
  private String usImage;
  private String usDate;
  private String usOpenId;
  private long usIntegral;
  private List<ConnerGoods> connerGoodsList;


  public String getUsId() {
    return usId;
  }

  public void setUsId(String usId) {
    this.usId = usId;
  }

  public List<ConnerGoods> getConnerGoodsList() {
    return connerGoodsList;
  }

  public void setConnerGoodsList(List<ConnerGoods> connerGoodsList) {
    this.connerGoodsList = connerGoodsList;
  }

  public String getUsOpenId() {
    return usOpenId;
  }

  public void setUsOpenId(String usOpenId) {
    this.usOpenId = usOpenId;
  }

  public String getUsName() {
    return usName;
  }

  public void setUsName(String usName) {
    this.usName = usName;
  }


  public String getUsImage() {
    return usImage;
  }

  public void setUsImage(String usImage) {
    this.usImage = usImage;
  }


  public String getUsDate() {
    return usDate;
  }

  public void setUsDate(String usDate) {
    this.usDate = usDate;
  }


  public long getUsIntegral() {
    return usIntegral;
  }

  public void setUsIntegral(long usIntegral) {
    this.usIntegral = usIntegral;
  }

}
