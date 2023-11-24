package in.ac.saispurthi.webapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "committee_table")
public class CommitteeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;
    private String cmtee;
    private String cord;
    private String email;
    private String mno;
    private String hlink;
}
