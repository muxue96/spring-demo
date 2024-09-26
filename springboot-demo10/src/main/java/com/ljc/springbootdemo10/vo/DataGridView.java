package com.ljc.springbootdemo10.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 前台展示数据
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataGridView {
    private Integer code = 0;
    private String msg = "";
    private long count;
    private Object data;

    public DataGridView(long count, Object data) {
        this.count = count;
        this.data = data;
    }
}
