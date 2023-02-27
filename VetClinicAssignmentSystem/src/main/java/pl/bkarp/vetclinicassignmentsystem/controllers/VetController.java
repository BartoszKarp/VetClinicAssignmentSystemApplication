package pl.bkarp.vetclinicassignmentsystem.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vet")
public class VetController {

    @GetMapping
    public String cos(){
        return "vet test";
    }
}
