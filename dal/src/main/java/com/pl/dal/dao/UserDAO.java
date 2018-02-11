package com.pl.dal.dao;

import com.kili.common.core.dao.BaseDAO;
import com.pl.dal.dataobject.UserDO;
import org.springframework.stereotype.Repository;

/**
 * 用户dao
 * Created by mo on 2017/10/30.
 */
@Repository
public interface UserDAO extends BaseDAO<UserDO> {

    /**
     * 根据用户名获取用户名
     *
     * @param userName
     * @return
     */
    UserDO queryUserByName(String userName);
}
