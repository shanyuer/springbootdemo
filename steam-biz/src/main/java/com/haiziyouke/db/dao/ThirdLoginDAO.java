/*
 * Copyright (c) 2015 All Rights Reserved.
 */
package com.haiziyouke.db.dao;

// auto generated imports


import com.haiziyouke.db.model.ThirdLoginDO;
import com.haiziyouke.service.query.ThirdLoginQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThirdLoginDAO {
	/**
	 *
	 * @param thirdLogin
	 * @return
	 */
    public Integer insertThirdUser(ThirdLoginDO thirdLogin);

	/**
	 *
	 * @param query
	 * @return
	 */
    public List<ThirdLoginDO> selectThirdUser(@Param("query") ThirdLoginQuery query);

	/**
	 *
	 * @param update
	 * @return
	 */
    public int updateSetUnionID(@Param("update") ThirdLoginQuery update);

	/**
	 *
	 * @param userId
	 * @return
	 */
    public int deleteUser(@Param("userId") String userId);

}