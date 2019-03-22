package com.iba.courses.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "login")
    @NonNull
    private String login;

    @Column(name = "password")
    @NonNull
    private String password;

    @Column(name = "university")
    @NonNull
    private String university;

    @Column(name = "course")
    @NonNull
    private String course;

    public Student(@NonNull String name, @NonNull String login, @NonNull String password, @NonNull String university, @NonNull String course) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.university = university;
        this.course = course;
    }
}
