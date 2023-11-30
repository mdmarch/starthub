package ru.hse.starthub.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;


@Table(name = "STARTUP")
@Entity
@Getter
@Setter
public class StartupModel {

    @Id
    @Column(name = "ID")
    @NonNull
    private String id;
    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OWNER")
    private String owner;

}
