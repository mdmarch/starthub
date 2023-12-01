package ru.hse.starthub.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StartupRepository extends CrudRepository<StartupModel, Long> {

}
