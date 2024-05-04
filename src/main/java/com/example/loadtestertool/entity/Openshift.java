package com.example.loadtestertool.entity;

import javax.persistence.*;

@Entity
@Table(name = "openshift")
public class Openshift {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(length = 128, nullable = false)
  private String url;

  public Openshift() {
  }

  public Openshift(String url) { this.url = url; }

  public Integer getId() { return id; }

  public void setId(Integer id) { this.id = id; }

  public String getUrl() { return url; }

  public void setUrl(String url) { this.url = url; }

  @Override
  public String toString() {
    return "Openshift Config Parameter [url=" + url + "]";
  }

}
