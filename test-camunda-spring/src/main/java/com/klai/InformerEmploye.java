package com.klai;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class InformerEmploye implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        boolean approuve = (boolean) delegateExecution.getVariable("approved");
        //String employeId = (String) delegateExecution.getVariable("employeId");
        String employeId ="emp-1";
        if (approuve) {
            System.out.println("Employé informé de l'approbation du congé : " + employeId);
        } else {
            System.out.println("Employé informé du refus du congé : " + employeId);
        }
    }
}
