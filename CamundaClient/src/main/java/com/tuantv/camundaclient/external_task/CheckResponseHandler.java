package com.tuantv.camundaclient.external_task;

import com.tuantv.camundaclient.external_task.base.BaseExternalTaskHandler;
import com.tuantv.camundaclient.external_task.dto.input.CheckResponseInput;
import com.tuantv.camundaclient.external_task.dto.output.CheckResponseOutput;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription(topicName = "check-response")
public class CheckResponseHandler extends BaseExternalTaskHandler<CheckResponseInput, CheckResponseOutput> {
    @Override
    protected CheckResponseOutput handler(CheckResponseInput inputData) {
        System.out.println("input data " + inputData);
        return new CheckResponseOutput();
    }
}
