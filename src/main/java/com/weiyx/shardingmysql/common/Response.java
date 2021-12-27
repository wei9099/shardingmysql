package com.weiyx.shardingmysql.common;

public class Response<T> {

    private int code;
    private String message;
    private T data;

    /**
     * 成功时调用
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Response<T> success(T data){
        return new Response<T>(data);
    }

    /**
     * 失败时调用
     * @param codeMsg
     * @param <T>
     * @return
     */
    public static <T> Response error(CodeMsg codeMsg){
        return new Response<T>(codeMsg);
    }

    /**
     * 构造方法私有化，不允许外部new Result
     * @param data
     */
    private Response(T data){
        this.code = 0;
        this.message = "SUCCESS";
        this.data = data;
    }

    /**
     * 构造方法私有化，不允许外部new Result
     * @param codeMsg
     */
    private Response(CodeMsg codeMsg){
        if (null == codeMsg) {
            return;
        }
        this.code = codeMsg.getCode();
        this.message = codeMsg.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}