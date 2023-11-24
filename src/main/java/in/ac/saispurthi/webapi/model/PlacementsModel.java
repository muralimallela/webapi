package in.ac.saispurthi.webapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "placements_table")
public class PlacementsModel {
    private String sno;
    private String ay;
    @Id
    private String htno;
    private String sname;
    private String branch;
    private String cname;
    private BigDecimal salary;
    private String phno;
    private String mailid;

}
