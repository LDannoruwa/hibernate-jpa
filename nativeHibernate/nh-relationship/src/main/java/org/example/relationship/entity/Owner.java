package org.example.relationship.entity;

import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

//-------------Lombok--------------
@NoArgsConstructor
@AllArgsConstructor
@Data
//------------------------------------

@Entity
@Table(name = "owner") //To change/add table name
public class Owner {
    //Using @Embedded
    @Id
	@Column(name = "owner_id")
    private int id;

    @Column(nullable = false)
    private String name;
	
	//OneToMany relationship | one side
	@OneToMany(mappedBy = "owner")
	private List<Pet> petList = new ArrayList<>();
	
	//create constructor without using Lombok
	public Owner(int id, String name){
		this.id =id;
		this.name = name;
	}
}
