package com.example.issuesdashboard.events;

import com.example.issuesdashboard.github.GithubClient;
import com.example.issuesdashboard.github.RepositoryEvent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventsController {

  private final GithubClient githubClient;

  private final GithubProjectRepository repository;

  public EventsController(GithubClient githubClient, GithubProjectRepository repository) {
    this.githubClient = githubClient;
    this.repository = repository;
  }

  @GetMapping("/events/{repoName}")
  @ResponseBody
  public RepositoryEvent[] fetchEvents(@PathVariable String repoName) {
    GithubProject project = repository.findByRepoName(repoName);
    return this.githubClient.fetchEvents(project.getOrgName(), project.getRepoName()).getBody() ;
  }
}
