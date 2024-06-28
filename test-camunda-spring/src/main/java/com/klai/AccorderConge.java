package com.klai;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class AccorderConge implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        //String employeId = (String) delegateExecution.getVariable("employeId");
        String employeId = "emp-1";
        System.out.println("Congé accordé à : " + employeId);
    }
}
