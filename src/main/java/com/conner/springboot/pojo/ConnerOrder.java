package com.conner.springboot.pojo;


public class ConnerOrder {

  private String orId;
  private String orName;
  private String orRentDate;
  private String orBackDate;
  private String orMaster;
  private String orImage;
  private String orStuats;
  private long orPrice;
  private String usid;
  private String goid;

  public String getGoid() {
    return goid;
  }

  public void setGoid(String goid) {
    this.goid = goid;
  }

  public String getOrId() {
    return orId;
  }

  public void setOrId(String orId) {
    this.orId = orId;
  }


  public String getOrName() {
    return orName;
  }

  public void setOrName(String orName) {
    this.orName = orName;
  }


  public String getOrRentDate() {
    return orRentDate;
  }

  public void setOrRentDate(String orRentDate) {
    this.orRentDate = orRentDate;
  }


  public String getOrBackDate() {
    return orBackDate;
  }

  public void setOrBackDate(String orBackDate) {
    this.orBackDate = orBackDate;
  }


  public String getOrMaster() {
    return orMaster;
  }

  public void setOrMaster(String orMaster) {
    this.orMaster = orMaster;
  }


  public String getOrImage() {
    return orImage;
  }

  public void setOrImage(String orImage) {
    this.orImage = orImage;
  }


  public String getOrStuats() {
    return orStuats;
  }

  public void setOrStuats(String orStuats) {
    this.orStuats = orStuats;
  }


  public Long getOrPrice() {
    return orPrice;
  }

  public void setOrPrice(long orPrice) {
    this.orPrice = orPrice;
  }


  public String getUsid() {
    return usid;
  }

  public void setUsid(String usid) {
    this.usid = usid;
  }

}
