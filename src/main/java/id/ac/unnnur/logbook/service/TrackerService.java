package id.ac.unnnur.logbook.service;

import id.ac.unnnur.logbook.repository.TrackerRepository;
import org.springframework.stereotype.Service;

@Service
public class TrackerService {

    private final TrackerRepository repository;

    public TrackerService(TrackerRepository repository) {
        this.repository = repository;
    }
}
