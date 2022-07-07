package id.ac.unnnur.logbook.repository;

import id.ac.unnnur.logbook.model.Project;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {
}
