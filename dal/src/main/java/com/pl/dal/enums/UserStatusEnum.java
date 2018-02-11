package com.pl.dal.enums;

/**
 * Created by mo on 2018/2/11.
 */
public enum UserStatusEnum implements BaseEnum {

    /**
     *
     */
    ENABLED("E", "enabled"),

    /**
     *
     */
    DISABLED("D", "disabled");

    private String code;
    private String desc;

    /**
     * @param code
     * @param desc
     */
    UserStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
