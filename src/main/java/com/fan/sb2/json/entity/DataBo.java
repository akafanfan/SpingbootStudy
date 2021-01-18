package com.fan.sb2.json.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class DataBo implements Serializable {
    private static final long serialVersionUID = -8983338245728515959L;
    private String code;
    private String msg;
    private List<Map<String, Object>> data;

}
