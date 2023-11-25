package pl.madamusinski.applicationservice.model;

import lombok.Data;

@Data
public class Application {
    private long id;
    private String uuid;
    private String name;
    private String description;
    private StateNames stateNames;
    private String deletionReason;
    private String rejectionReason;
}
