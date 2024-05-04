package com.example.loadtestertool.entity;

import javax.persistence.*;

@Entity
@Table(name = "os_config_parameters")
public class OpenshiftConfigParameters {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(length = 128, nullable = false)
  private String name;

  @Column(nullable = false)
  private String value;

  public OpenshiftConfigParameters() {
  }

  public OpenshiftConfigParameters(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public String getValue() { return value; }

  public void setValue(String value) { this.value = value; }

  @Override
  public String toString() {
    return "Openshift Config Parameter [id=" + id + ", name=" + name + ", value=" + value + "]";
  }

}
