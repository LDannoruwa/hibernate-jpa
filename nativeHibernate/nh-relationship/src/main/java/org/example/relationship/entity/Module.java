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
@Table(name = "module") //To change/add table name
public class Module {
    @Id
	@Column(name = "module_code")
    private String code;

    @Column(nullable = false)
    private String description;
	
	//ManyToMany relationship
	@ManyToMany
	@JoinTable(
		name = "lecturer_details",
		joinColumns = @JoinColumn(name = "module_code", nullable = false, referencedColumnName = "module_code"),
		inverseJoinColumns = @JoinColumn(name = "lecturer_id", nullable = false, referencedColumnName = "lecturer_id")
	)
	private List<Lecturer> lecturerList = new ArrayList<>();
	
	//create constructor without using Lombok
	public Module(String code, String description){
		this.code = code;
		this.description = description;
	}
}
