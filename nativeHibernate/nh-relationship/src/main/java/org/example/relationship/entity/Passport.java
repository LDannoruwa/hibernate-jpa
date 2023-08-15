package org.example.relationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//-------------Lombok--------------
@NoArgsConstructor
@AllArgsConstructor
@Data
//------------------------------------

@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @Column(name = "passport_id")
    private String id;

    @Column(name = "issue_date", nullable = false)
    private String issueData;

    //---------------------
    //OneTOOne relationship
    @OneToOne
    @JoinColumn(name = "passenger_id", nullable = false, referencedColumnName = "passenger_id")
    private Passenger passenger;
}
