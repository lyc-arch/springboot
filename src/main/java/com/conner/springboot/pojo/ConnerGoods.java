package com.conner.springboot.pojo;


import java.util.List;

public class ConnerGoods {

  private String goId;
  private String goName;
  private String goCategory;
  private String goMessage;
  private String goCreateDate;
  private String goRentDate;
  private String goBackDate;
  private long goNumber;
  private String goRentAddress;
  private String goBackAddress;
  private long goRentPrice;
  private long goGoodPrice;
  private long goAllPrice;
  private String goMasterName;
  private String goMasterImage;
  private String goButtonColor;
  private String goGoodStatus;
  private long goGoodTalkNumber;
  private String usid;
  private String adid;
  private List<ConnerPhotos> photosList;


  public String getUsid() {
    return usid;
  }

  public void setUsid(String usid) {
    this.usid = usid;
  }

  public long getGoAllPrice() {
    return goAllPrice;
  }

  public void setGoAllPrice(long goAllPrice) {
    this.goAllPrice = goAllPrice;
  }

  public String getAdid() {
    return adid;
  }

  public void setAdid(String adid) {
    this.adid = adid;
  }

  public String getGoMasterName() {
    return goMasterName;
  }

  public String getGoMasterImage() {
    return goMasterImage;
  }

  public void setGoMasterImage(String goMasterImage) {
    this.goMasterImage = goMasterImage;
  }

  public void setGoMasterName(String goMasterName) {
    this.goMasterName = goMasterName;
  }

  public String getGoId() {
    return goId;
  }

  public void setGoId(String goId) {
    this.goId = goId;
  }

  public String getGoButtonColor() {
    return goButtonColor;
  }

  public void setGoButtonColor(String goButtonColor) {
    this.goButtonColor = goButtonColor;
  }

  public String getGoGoodStatus() {
    return goGoodStatus;
  }

  public long getGoGoodTalkNumber() {
    return goGoodTalkNumber;
  }

  public void setGoGoodTalkNumber(long goGoodTalkNumber) {
    this.goGoodTalkNumber = goGoodTalkNumber;
  }

  public void setGoGoodStatus(String goGoodStatus) {
    this.goGoodStatus = goGoodStatus;
  }

  public String getGoName() {
    return goName;
  }

  public void setGoName(String goName) {
    this.goName = goName;
  }


  public String getGoCategory() {
    return goCategory;
  }

  public void setGoCategory(String goCategory) {
    this.goCategory = goCategory;
  }


  public String getGoMessage() {
    return goMessage;
  }

  public void setGoMessage(String goMessage) {
    this.goMessage = goMessage;
  }


  public String getGoCreateDate() {
    return goCreateDate;
  }

  public void setGoCreateDate(String goCreateDate) {
    this.goCreateDate = goCreateDate;
  }


  public String getGoRentDate() {
    return goRentDate;
  }

  public void setGoRentDate(String goRentDate) {
    this.goRentDate = goRentDate;
  }


  public String getGoBackDate() {
    return goBackDate;
  }

  public void setGoBackDate(String goBackDate) {
    this.goBackDate = goBackDate;
  }


  public long getGoNumber() {
    return goNumber;
  }

  public void setGoNumber(long goNumber) {
    this.goNumber = goNumber;
  }


  public String getGoRentAddress() {
    return goRentAddress;
  }

  public void setGoRentAddress(String goRentAddress) {
    this.goRentAddress = goRentAddress;
  }


  public String getGoBackAddress() {
    return goBackAddress;
  }

  public void setGoBackAddress(String goBackAddress) {
    this.goBackAddress = goBackAddress;
  }


  public long getGoRentPrice() {
    return goRentPrice;
  }

  public void setGoRentPrice(long goRentPrice) {
    this.goRentPrice = goRentPrice;
  }


  public long getGoGoodPrice() {
    return goGoodPrice;
  }

  public void setGoGoodPrice(long goGoodPrice) {
    this.goGoodPrice = goGoodPrice;
  }

  public List<ConnerPhotos> getPhotosList() {
    return photosList;
  }

  public void setPhotosList(List<ConnerPhotos> photosList) {
    this.photosList = photosList;
  }


}
