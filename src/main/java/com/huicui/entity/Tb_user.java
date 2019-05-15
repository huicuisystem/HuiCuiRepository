package com.huicui.entity;

public class Tb_user {
  private Long user_id;
  private Long details_id;
  private String user_name;
  private String password;
  private String salt;

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public Long getDetails_id() {
    return details_id;
  }

  public void setDetails_id(Long details_id) {
    this.details_id = details_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
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
