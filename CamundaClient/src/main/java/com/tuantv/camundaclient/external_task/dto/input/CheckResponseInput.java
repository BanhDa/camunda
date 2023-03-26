package com.tuantv.camundaclient.external_task.dto.input;

import com.tuantv.camundaclient.external_task.base.InputData;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CheckResponseInput extends InputData {

    private String name;

}
