package com.example.loadtestertool.entity;

import javax.persistence.*;


@Entity
public class OpenshiftConfigParameters {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer param_id;

  @Column(length = 128, nullable = false)
  private String param_name;

  @Column(length = 128, nullable = false)
  private String param_value;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  private OpenshiftAppConfig openshiftAppConfig;

  public OpenshiftConfigParameters() {
  }

  public OpenshiftConfigParameters(String param_name, String param_value) {
    this.param_name = param_name;
    this.param_value = param_value;
  }

  public Integer getId() {
    return param_id;
  }

  public void setId(Integer param_id) {
    this.param_id = param_id;
  }

  public String getName() { return param_name; }

  public void setName(String param_name) { this.param_name = param_name; }

  public String getValue() { return param_value; }

  public void setValue(String param_value) { this.param_value = param_value; }

  public OpenshiftAppConfig getOpenshiftAppConfig() { return openshiftAppConfig; }

  public void setOpenshiftAppConfig(OpenshiftAppConfig openshiftAppConfig) {
    this.openshiftAppConfig = openshiftAppConfig;
  }

  @Override
  public String toString() {
    return "Openshift Config Parameter [id=" + param_id + ", name=" + param_name + ", value=" + param_value + "]";
  }

}
