package ru.hse.starthub.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartupRepository extends CrudRepository<StartupModel, String> {

}
