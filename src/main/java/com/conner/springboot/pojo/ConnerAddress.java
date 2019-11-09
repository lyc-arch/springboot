package com.conner.springboot.pojo;


public class ConnerAddress {

  private String adId;
  private String adName;
  private String adAnotherName;
  private String adStartDate;
  private String adEndDate;
  private double adLong;
  private double adLat;


  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }


  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }


  public String getAdAnotherName() {
    return adAnotherName;
  }

  public void setAdAnotherName(String adAnotherName) {
    this.adAnotherName = adAnotherName;
  }


  public String getAdStartDate() {
    return adStartDate;
  }

  public void setAdStartDate(String adStartDate) {
    this.adStartDate = adStartDate;
  }


  public String getAdEndDate() {
    return adEndDate;
  }

  public void setAdEndDate(String adEndDate) {
    this.adEndDate = adEndDate;
  }


  public double getAdLong() {
    return adLong;
  }

  public void setAdLong(double adLong) {
    this.adLong = adLong;
  }


  public double getAdLat() {
    return adLat;
  }

  public void setAdLat(double adLat) {
    this.adLat = adLat;
  }

}
