package com.tuantv.camundaclient.external_task;

import com.tuantv.camundaclient.external_task.base.BaseExternalTaskHandler;
import com.tuantv.camundaclient.external_task.dto.input.TemplateInputData;
import com.tuantv.camundaclient.external_task.dto.output.TemplateOutputData;
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("templateHandler")
public class TemplateExternalTaskHandler extends BaseExternalTaskHandler<TemplateInputData, TemplateOutputData> {
    @Override
    protected TemplateOutputData handler(TemplateInputData inputData) {
        System.out.println("input Dataa" + inputData);
        return new TemplateOutputData();
    }

}
