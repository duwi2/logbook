package id.ac.unnnur.logbook.repository;

import id.ac.unnnur.logbook.model.Tracker;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackerRepository extends PagingAndSortingRepository<Tracker, Long> {
    Page<Tracker> findAllByTrackerStatus(Boolean status);
    Page<Tracker> findByTrackerBy(String createdBy);
}
