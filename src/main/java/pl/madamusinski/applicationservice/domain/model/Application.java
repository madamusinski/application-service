package pl.madamusinski.applicationservice.domain.model;

import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Data
public class Application {
    private long id;
    private String uuid;
    private String name;
    private String description;
    @JdbcTypeCode(SqlTypes.JSON)
    private StateNames stateNames;
    private String deletionReason;
    private String rejectionReason;
}
