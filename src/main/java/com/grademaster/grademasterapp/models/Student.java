package com.grademaster.grademasterapp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 150, name = "first_name")
    private String firstName;

    @Column(nullable = false, length = 150, name = "last_name")
    private String lastName;

}
