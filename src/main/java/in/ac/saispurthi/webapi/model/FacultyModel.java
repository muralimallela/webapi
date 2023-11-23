package in.ac.saispurthi.webapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "faculty_table")
public class FacultyModel {
    private String sid;
    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String fid;
    private String fname;
    private String fdesignation;
    private String fdept;
    private String fqualification;
    private String fstream;
    private int fexp;
    private String fdob;
    private String fdoc;
    private String fmobile;
    private String femail;
    private String fotherqual;
    private int status;
}
