package com.ljc.springbootdemo10.constant;

/**
 * 常量接⼝状态码
 */
public interface SysConstant {
    /**
     * 操作状态
     */
    String ADD_SUCCESS = "添加成功";
    String ADD_ERROR = "添加失败";
    String UPDATE_SUCCESS = "修改成功";
    String UPDATE_ERROR = "修改失败";
    String DELETE_SUCCESS = "删除成功";
    String DELETE_ERROR = "删除失败";
    String RESET_SUCCESS = "重置成功";
    String RESET_ERROR = "重置失败";
    String DISPATCH_SUCCESS = "分配成功";
    String DISPATCH_ERROR = "分配失败";
    Integer CODE_SUCCESS = 0;//操作成功
    Integer CODE_ERROR = -1;//操作失败
}