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
@Table(name = "lecturer") //To change/add table name
public class Lecturer {
    @Id
	@Column(name = "lecturer_id")
    private int id;

    @Column(nullable = false)
    private String name;
	
	//ManyToMany relationship
	@ManyToMany(mappedBy = "lecturerList")
	private List<Module> moduleList = new ArrayList<>();
	
	//create constructor without using Lombok
	public Lecturer(int id, String name){
		this.id =id;
		this.name = name;
	}
}
