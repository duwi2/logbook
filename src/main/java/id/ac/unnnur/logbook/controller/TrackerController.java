package id.ac.unnnur.logbook.controller;

import id.ac.unnnur.logbook.service.TrackerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trackers")
public class TrackerController {

    private final Logger logger = LoggerFactory.getLogger(TrackerController.class);

    private final TrackerService service;

    public TrackerController(TrackerService service) {
        this.service = service;
    }
}
