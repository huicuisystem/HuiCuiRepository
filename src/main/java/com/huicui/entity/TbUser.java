package com.huicui.entity;

public class TbUser {
  private Long userId;
  private Long detailsId;
  private String userName;
  private String password;
  private String salt;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getDetailsId() {
    return detailsId;
  }

  public void setDetailsId(Long detailsId) {
    this.detailsId = detailsId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }
}
