package ru.hse.starthub.controller;

import org.springframework.web.bind.annotation.*;
import ru.hse.starthub.model.StartupModel;
import ru.hse.starthub.service.StartupService;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping("startup")
public class StartupController {

    private final StartupService service;

    public StartupController(StartupService service) {
        this.service = service;
    }

    @PostMapping
    public Response create(StartupModel startup) {
        StartupModel ret = service.create(startup);
        return Response.status(Response.Status.CREATED).entity(startup).build();
    }

    @PutMapping
    @PatchMapping
    public Response update(StartupModel startup) {
        StartupModel ret = service.create(startup);
        return Response.ok(startup).build();
    }

}
