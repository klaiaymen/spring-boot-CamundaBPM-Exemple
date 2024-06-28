package com.klai;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ApprouverDemande implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        boolean approuve = true;
        delegateExecution.setVariable("approved", approuve);
    }
}
