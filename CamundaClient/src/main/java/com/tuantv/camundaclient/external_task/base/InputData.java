package com.tuantv.camundaclient.external_task.base;

import lombok.Data;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskService;

@Data
public class InputData {

    private ExternalTask externalTask;

    private ExternalTaskService externalTaskService;

}
