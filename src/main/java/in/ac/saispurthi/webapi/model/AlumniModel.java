package in.ac.saispurthi.webapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alumni")
public class AlumniModel {
    private String name;
    @Id
    private String hallticket;
    private String email;
    private String city;
    private String state;
    private String country;
    private String yop;
    private String qualification;
    private String dept;
    private String organisation;
    private String designation;
    private String hedu;
    private String hcity;
    private String hstate;
    private String hcountry;
    private String ract;
    private String phno;
}
