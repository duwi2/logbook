package id.ac.unnnur.logbook.service;

import id.ac.unnnur.logbook.model.Project;
import id.ac.unnnur.logbook.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public Project getDataProjectById(Long projectId) {
        Project project = new Project();
        return project;
    }
}
