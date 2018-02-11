package com.pl.dal.typehandler;

import com.pl.dal.enums.UserStatusEnum;
import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

/**
 * Created by mo on 2018/2/11.
 */
@Alias("userStatusTypeHandler")
@MappedTypes(UserStatusEnum.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class UserStatusTypeHandler extends BaseStringTypeHandler<UserStatusEnum> {

    @Override
    protected void initCache() {
        for (UserStatusEnum status : UserStatusEnum.values()) {
            table.put(status.getCode(), status);
        }
    }

    @Override
    protected String getString(UserStatusEnum enumObj) {
        return enumObj.getCode();
    }
}
