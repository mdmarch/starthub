package ru.hse.starthub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name = "STARTUP")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class StartupModel {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OWNER")
    private String owner;

}
