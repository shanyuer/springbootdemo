/*
 * Copyright (c) 2015 All Rights Reserved.
 */
package com.haiziyouke.db.dao;

import com.haiziyouke.db.model.PlatformUserDO;
import com.haiziyouke.service.query.PlatformUserQuery;
import org.apache.ibatis.annotations.Param;

public interface PlatformUserDAO {

	/**
	 *
	 * @param query
	 * @return
	 */
    public PlatformUserDO selectplatformUser(@Param("query") PlatformUserQuery query);

}