package com.haiziyouke.db.dao;

import com.haiziyouke.service.query.UserQuery;
import org.apache.ibatis.annotations.Param;
import com.haiziyouke.db.model.UserDO;

import java.util.List;


public interface UserDAO {

    public void insertUser(UserDO user);

    public UserDO selectUserByUserId(@Param("query") UserQuery query);

    public int updateUserByUserId(@Param("update") UserDO update);

    public List<UserDO> selectUserByUserName(@Param("query") UserQuery query);

    public long selectUserByUserNameCount(@Param("query") UserQuery query);

    public List<UserDO> selectUserByUserOrPhone(@Param("query") UserQuery query);

    public List<UserDO> selectUserByUserOrPhoneByOrder(@Param("query") UserQuery query);

    public int updateUserIdentity(@Param("update") UserDO update);

    public void insertUserByManager(UserDO user);

    public int update(@Param("update") UserDO update);

    public int bindUserByUserId(@Param("update") UserDO update);

    public List<UserDO> selectAllSJ(@Param("query") UserQuery query);

    public UserDO selectByUserNameForManage(@Param("query") UserQuery query);

    public UserDO selectUserByUserIdForApp(@Param("query") UserQuery query);

    public List<UserDO> selectTeacherList(@Param("query") UserQuery query);

    public UserDO selectTeacheByName(@Param("nickName") String nickName);

    public long selectTeacherCount(@Param("query") UserQuery query);

    public void addTeacher(UserDO user);

    public int updateTeacher(@Param("update") UserDO update);

    public List<UserDO> selectUserByUserIds(@Param("query") UserQuery query);

    public List<UserDO> selectAllClientId();

    public List<UserDO> selectByUserNameForList(@Param("nickName") String nickName);

    public int deleteUserInfo(@Param("userId") String userId);

}