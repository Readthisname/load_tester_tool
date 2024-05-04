package com.example.loadtestertool.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "os_app_configs")
public class OpenshiftAppConfig {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(length = 128, nullable = false)
  private String name;

  @Column
  private Openshift openshift;

  @Column
  private List<OpenshiftConfigParameters> configParameters;

  public OpenshiftAppConfig() {
  }

  public OpenshiftAppConfig(String name, List<OpenshiftConfigParameters> configParameters) {
    this.name = name;
    this.configParameters = configParameters;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() { return name; }

  public void setName(String name) { this.name = name; }

  public Openshift getOpenshift() { return openshift; }

  public void setOpenshift(Openshift openshift) { this.openshift = openshift; }

  public List<OpenshiftConfigParameters> getConfigParameters() { return configParameters; }

  public void setConfigParameters(List<OpenshiftConfigParameters> configParameters) {
    this.configParameters = configParameters;
  }

  @Override
  public String toString() {
    return "Openshift Config Parameter [id=" + id + ", name=" + name + ", openshift= " + openshift +
            ", configParameters=" + configParameters + "]";
  }

}
