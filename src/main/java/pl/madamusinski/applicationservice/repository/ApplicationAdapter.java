package pl.madamusinski.applicationservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ApplicationAdapter<T> {

    Page<T> fetchAllApplications();
    T createNewApplication(String name, String description);
    T deleteApplication(String name, String deletionReason);

}
