package com.ljc.springbootdemo10.constant;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 *
 * 服务器返回信息
 *
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultObj {
    private Integer code;
    private String msg;
    /**
     * 添加成功
     */
    public static final ResultObj ADD_SUCCESS = new
            ResultObj(SysConstant.CODE_SUCCESS, SysConstant.ADD_SUCCESS);
    /**
     * 添加失败
     */
    public static final ResultObj ADD_ERROR = new
            ResultObj(SysConstant.CODE_ERROR, SysConstant.ADD_ERROR);
    /**
     * 更新成功
     */
    public static final ResultObj UPDATE_SUCCESS = new
            ResultObj(SysConstant.CODE_SUCCESS, SysConstant.UPDATE_SUCCESS);
    /**
     * 更新失败
     */
    public static final ResultObj UPDATE_ERROR = new
            ResultObj(SysConstant.CODE_ERROR, SysConstant.UPDATE_ERROR);
    /**
     * 删除成功
     */
    public static final ResultObj DELETE_SUCCESS = new
            ResultObj(SysConstant.CODE_SUCCESS, SysConstant.DELETE_SUCCESS);
    /**
     * 删除失败
     */
    public static final ResultObj DELETE_ERROR = new
            ResultObj(SysConstant.CODE_ERROR, SysConstant.DELETE_ERROR);

    /**
     * 重置成功
     */
    public static final ResultObj RESET_SUCCESS = new
            ResultObj(SysConstant.CODE_SUCCESS, SysConstant.RESET_SUCCESS);
    /**
     * 重置失败
     */
    public static final ResultObj RESET_ERROR = new
            ResultObj(SysConstant.CODE_ERROR, SysConstant.RESET_ERROR);
    /**
     * 分配成功
     */
    public static final ResultObj DISPATCH_SUCCESS = new
            ResultObj(SysConstant.CODE_SUCCESS, SysConstant.DISPATCH_SUCCESS);
    /**
     * 分配失败
     */
    public static final ResultObj DISPATCH_ERROR = new
            ResultObj(SysConstant.CODE_ERROR, SysConstant.DISPATCH_ERROR);
    /**
     * 状态码0 成功
     */
    public static final ResultObj STATUS_TRUE = new
            ResultObj(SysConstant.CODE_SUCCESS);
    /**
     * 状态码-1 失败
     */
    public static final ResultObj STATUS_FALSE = new
            ResultObj(SysConstant.CODE_ERROR);


    private ResultObj(Integer code) {
        this.code = code;
    }
}