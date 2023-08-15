package org.example.relationship.entity;

import jakarta.persistence.*;
import org.example.relationship.entity.embeddable.Name;

import lombok.*;

//-------------Lombok--------------
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString

//You can use @Data instead of @Getter, @Setter, @ToString
@Data
//------------------------------------

@Entity

@Table(name = "employee") //To change/add table name
public class Employee {
    /*-----------[method - 1]---------------------------------*/
    /*
    @Id
    private int id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "middle_name", nullable = false)
    private String middleName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(nullable = false, columnDefinition = "text")
    private String address; //varchar has a limit. -> use text
    */
    /*-----------------------------------------------------------*/

    /*--------------[method - 2]--------------------------------*/
    //Using @Embedded
    @Id
    private int id;

    @Embedded
    private Name name;

    @Column(nullable = false, columnDefinition = "text")
    private String address; //varchar has a limit. -> use text
    /*---------------------------------------------------------*/

}
