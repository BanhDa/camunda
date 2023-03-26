package com.tuantv.camundaclient.external_task.base;

import com.tuantv.camundaclient.utils.ModelMapperUtils;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

@Slf4j
public abstract class BaseExternalTaskHandler<Input extends InputData, Output extends OutputData> implements ExternalTaskHandler {

    private static final String RESPONSE = "response";

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        Map<String, Object> allVariables = externalTask.getAllVariables();
        Input input = ModelMapperUtils.map(allVariables, getInputClassType());
        log.debug("[INPUT_DATA] {}", input);
        input.setExternalTask(externalTask);
        input.setExternalTaskService(externalTaskService);

        Output output = handler(input);
        log.debug("[OUTPUT_DATA] {}", output);
        VariableMap variables = Variables.createVariables();
        variables.put(RESPONSE, output);
        externalTaskService.complete(externalTask, variables);
    }

    protected abstract Output handler(Input inputData);

    private Class<Input> getInputClassType() {
        return (Class) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
