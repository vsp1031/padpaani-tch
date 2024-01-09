package com.hostel.demo.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "STD_DTLS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dtls {
//    @Table(name = "stddtls",
//    Uniqueconstraints=@UniqueConstraint(name = "PRN_UNIQUE",columnNames =PRN_NO))
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "PRN",nullable = false,Uniqueconstraints=@UniqueConstraint(name = "PRN_NO",columnNames =PRN_NO))
//    private int  PRN_NO;
//    private String STUDENT_NAME;
//    private String RoomNo;
//    private String Floor;
//    private String Gender;
private  int prnno;
    private String name;
    private String email;
    private  int phone;
    private String Address;
    private String message;
    private String Year;
    private  String Domain;


//
}
