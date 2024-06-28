package com.klai;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

    private ProcessService processService;

    public ProcessController(ProcessService processService) {
        this.processService = processService;
    }


    @GetMapping("/demarrer-process")
    public ResponseEntity<String> demarrerProcess(){
        processService.demarrerProcess();
        return ResponseEntity.ok("le processus est en demarrage !");
    }


}
