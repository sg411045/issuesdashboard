package com.example.issuesdashboard.events;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class GithubProject implements Serializable {

  @Id
  @GeneratedValue
  private Long Id;

  private String orgName;

  @Column(unique = true)
  private String repoName;

  public GithubProject() {
  }

  public GithubProject(String orgName, String repoName) {
    this.orgName = orgName;
    this.repoName = repoName;
  }

  public Long getId() {
    return Id;
  }

  public String getOrgName() {
    return orgName;
  }

  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  @Override
  public String toString() {
    return "GithubProject{" +
        "Id=" + Id +
        ", orgName='" + orgName + '\'' +
        ", repoName='" + repoName + '\'' +
        '}';
  }
}
