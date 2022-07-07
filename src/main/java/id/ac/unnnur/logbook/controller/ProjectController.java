package id.ac.unnnur.logbook.controller;

import id.ac.unnnur.logbook.service.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final Logger logger = LoggerFactory.getLogger(ProjectController.class);

    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }
}
