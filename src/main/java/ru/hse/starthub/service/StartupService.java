package ru.hse.starthub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hse.starthub.model.StartupModel;
import ru.hse.starthub.model.StartupRepository;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Service
public class StartupService {

    //    @Autowired
    StartupRepository repository;

    @Autowired
    public StartupService(StartupRepository repository) {
        this.repository = repository;
    }

    public StartupModel create(StartupModel startupModel) {
        try {
            StartupModel startup = repository.save(startupModel);
            return startup;
        } catch (Exception e) {
            throw new WebApplicationException("Cannot create startup", Response.Status.BAD_REQUEST);
        }
    }

    public StartupModel update(StartupModel startupModel) {
        Optional<StartupModel> optionalStartup = repository.findById(startupModel.getId());
        if (optionalStartup.isEmpty()) {
            throw new WebApplicationException("You are trying to update non-existent startup", Response.Status.BAD_REQUEST);
        }
        StartupModel startup = optionalStartup.get();
        startup.setDescription(startupModel.getDescription());
        try {
            return repository.save(startup);
        } catch (Exception e) {
            throw new WebApplicationException("Cannot create startup", Response.Status.BAD_REQUEST);
        }
    }


}
