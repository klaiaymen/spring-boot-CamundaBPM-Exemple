package com.klai;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {

    private ProcessEngine processEngine;


    public ProcessService(ProcessEngine processEngine) {
        this.processEngine = processEngine;
    }

    public void demarrerProcess() {
        processEngine.getRuntimeService()
                .startProcessInstanceByMessage("demandeConge","conge-1");
    }


}
