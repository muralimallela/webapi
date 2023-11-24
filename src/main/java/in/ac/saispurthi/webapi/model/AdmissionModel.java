package in.ac.saispurthi.webapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "admission_table")
public class AdmissionModel {
    private Timestamp date;
    @Id
    private String appid;
    private String course;
    private String name;
    private String father;
    private String dob;
    private String email;
    private String nation;
    private String gender;
    private String caste;
    private String subcate;
    private String padd;
    private String cadd;
    private int number;
    private String jeehtno;
    private int jeerank;
    private String eamcetHt;
    private int eamcetRank;
    private String perGroup;
    private int perMarks;
    private int passyear;
    private String preference1;
    private String preference2;
    private String preference3;
    private String preference4;
    private String preference5;
    private String preference6;
    private String photo;
    private String ssc;
    private String interMarks;
    private String tc;
    private String studyConduct;
    private String casteCr;
    private String eamcetHtno;
    private String eamcetRc;
    private String jeeHt;
    private String jeeRc;
    private String aadhar;
    private String migration;
    private String status;

}
