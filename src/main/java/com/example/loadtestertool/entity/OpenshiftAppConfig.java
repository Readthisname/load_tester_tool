package com.example.loadtestertool.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
public class OpenshiftAppConfig {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(length = 128, nullable = false)
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  private Openshift openshift;

  public OpenshiftAppConfig() {}

  public OpenshiftAppConfig(String name, Set<OpenshiftConfigParameters> configParameters) {
    this.name = name;
  }

  public Integer getId() { return id; }

  public void setId(Integer id) { this.id = id; }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public Openshift getOpenshift() { return openshift; }

  public void setOpenshift(Openshift openshift) { this.openshift = openshift; }

  @Override
  public String toString() {
    return "Openshift Config Parameter [id=" + id + ", name=" + name + "]";
  }

}
