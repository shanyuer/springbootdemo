package com.haiziyouke.service.facade;

import com.haiziyouke.service.query.UserQuery;
import com.haiziyouke.service.vo.UserVO;

/**
 * Created by danbai on 17/5/4.
 */
public interface UserBiz {

    public UserVO selectUserByUserId(UserQuery userQuery);


}
