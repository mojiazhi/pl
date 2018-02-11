package com.pl.dal.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * EnumTypeHandler
 *
 * @author spance
 * @version 2017/5/26
 */
public abstract class BaseStringTypeHandler<T> extends BaseTypeHandler<T> {

    protected Map<String, T> table;

    public BaseStringTypeHandler() {
        table = new HashMap<>();
        initCache();
    }

    protected abstract void initCache();

    protected abstract String getString(T enumObj);

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, T enumObj, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i, getString(enumObj));
    }

    @Override
    public T getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String val = resultSet.getString(s);
        if (resultSet.wasNull()) {
            return null;
        } else {
            return table.get(val);
        }
    }

    @Override
    public T getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String val = resultSet.getString(i);
        if (resultSet.wasNull()) {
            return null;
        } else {
            return table.get(val);
        }
    }

    @Override
    public T getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String val = callableStatement.getString(i);
        if (callableStatement.wasNull()) {
            return null;
        } else {
            return table.get(val);
        }
    }
}
