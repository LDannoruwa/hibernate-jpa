package org.example.relationship.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//-------------Lombok--------------
@NoArgsConstructor
@AllArgsConstructor
@Data
//------------------------------------

@Entity
@Table(name = "passenger") //To change/add table name
public class Passenger {
	@Id
	@Column(name = "passenger_id")
    private int id;

    @Column(nullable = false)
    private String name;
}
