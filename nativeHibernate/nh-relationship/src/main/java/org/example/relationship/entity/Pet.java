package org.example.relationship.entity;

import jakarta.persistence.*;

import lombok.*;

//-------------Lombok--------------
@NoArgsConstructor
@AllArgsConstructor
@Data
//------------------------------------

@Entity
@Table(name = "pet") //To change/add table name
public class Pet {
    //Using @Embedded
    @Id
	@Column(name = "pet_id")
    private int id;

    @Column(name = "pet_name", nullable = false)
    private String name;
	
	//OneToMany relationship | Many side
	@ManyToOne
	@JoinColumn(name = "owner_id", nullable = false, referencedColumnName = "owner_id")
	private Owner owner;
}
