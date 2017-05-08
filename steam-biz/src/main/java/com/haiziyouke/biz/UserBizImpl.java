package com.haiziyouke.biz;

import com.haiziyouke.db.dao.PlatformUserDAO;
import com.haiziyouke.db.dao.ThirdLoginDAO;
import com.haiziyouke.db.dao.UserDAO;
import com.haiziyouke.db.model.PlatformUserDO;
import com.haiziyouke.db.model.ThirdLoginDO;
import com.haiziyouke.db.model.UserDO;
import com.haiziyouke.service.query.PlatformUserQuery;
import com.haiziyouke.service.query.ThirdLoginQuery;
import com.haiziyouke.service.query.UserQuery;
import com.haiziyouke.service.facade.UserBiz;
import com.haiziyouke.service.utils.CommonConverter;
import com.haiziyouke.service.vo.PlatformUserVO;
import com.haiziyouke.service.vo.ThirdLoginVO;
import com.haiziyouke.service.vo.UserVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by java on 16/4/22.
 */
@Component("userBiz")
public class UserBizImpl implements UserBiz {

    @Autowired
    private ThirdLoginDAO thirdLoginDAO;
    @Autowired
    private UserDAO userDAO;
	@Autowired
	private PlatformUserDAO platformUserDAO;

    public Integer insertUser(UserVO UserVO) {

        if(null == UserVO)
        {
            return 0;
        }

        UserDO user = new UserDO();
        CommonConverter.convert(UserVO,user);
        try {
            if(StringUtils.isNotBlank(UserVO.getOpenMethod())&&StringUtils.isNotBlank(UserVO.getOpenId()))
            {
                ThirdLoginDO thirdLoginDo = new ThirdLoginDO();
                CommonConverter.convert(UserVO,thirdLoginDo);
                thirdLoginDAO.insertThirdUser(thirdLoginDo);
            }
            userDAO.insertUser(user);
            return 1;
        }catch (Exception e)
        {
            return 0;
        }
    }

    public UserVO selectUserByUserId(UserQuery userQuery) {
        if(null == userQuery)
        {
            return null;
        }
        UserDO userDo = userDAO.selectUserByUserId(userQuery);
        if(null == userDo)
        {
            return null;
        }
        UserVO UserVO = new UserVO();
        CommonConverter.convert(userDo,UserVO);
        return UserVO;
    }

	public List<ThirdLoginVO> selectThirdUser(ThirdLoginQuery query) {
		if(null == query)
		{
			return null;
		}
		
		 List<ThirdLoginDO> listDao = thirdLoginDAO.selectThirdUser(query);
		 if(CollectionUtils.isEmpty(listDao))
		 {
			 return null;
		 }
		 List<ThirdLoginVO> listModel = new ArrayList<>();
		 CommonConverter.convertList(ThirdLoginVO.class, listDao, listModel);
		return listModel;
	}

	public Integer insertThirdUser(ThirdLoginVO model) {
		if(null == model)
		{
			return 0;
		}
		ThirdLoginDO thirdLogin = new ThirdLoginDO();
		CommonConverter.convert(model, thirdLogin);
		 Integer code = thirdLoginDAO.insertThirdUser(thirdLogin );
		return code;
	}

	public List<UserVO> selectUserByUserName(UserQuery userQuery) {
		List<UserDO>  userDo = userDAO.selectUserByUserName(userQuery);
		if(CollectionUtils.isEmpty(userDo))
		 {
			 return null;
		 }
		 List<UserVO> listModel = new ArrayList<>();
		 CommonConverter.convertList(UserVO.class, userDo, listModel);
		return listModel;
	}

	public List<UserVO> selectUserByUserOrPhone(UserQuery userQuery) {
		List<UserDO> userDo = userDAO.selectUserByUserOrPhone(userQuery);
		if (CollectionUtils.isEmpty(userDo)) {
			return null;
		}
		List<UserVO> listModel = new ArrayList<>();
		CommonConverter.convertList(UserVO.class, userDo, listModel);
		return listModel;
	}

	public long selectUserCount(UserQuery userQuery) {
		
		return userDAO.selectUserByUserNameCount(userQuery);
	}

	public List<UserVO> selectUserByUserOrPhoneByOrder(UserQuery userQuery) {
		List<UserDO> userDo = userDAO.selectUserByUserOrPhoneByOrder(userQuery);
		if (CollectionUtils.isEmpty(userDo)) {
			return null;
		}
		List<UserVO> listModel = new ArrayList<>();
		CommonConverter.convertList(UserVO.class, userDo, listModel);
		return listModel;
	}

	public int addUser(UserVO UserVO) {

		UserDO userDO = new UserDO();

		ThirdLoginDO thirdLoginDo = new ThirdLoginDO();
		CommonConverter.convert(UserVO, thirdLoginDo);
		thirdLoginDAO.insertThirdUser(thirdLoginDo);

		CommonConverter.convert(UserVO, userDO);
		userDAO.insertUserByManager(userDO);
		String userId = userDO.getUserId();
		int id = Integer.valueOf(userId);
		return id;
	}

	public List<UserVO> getAllSJ(UserQuery userQuery) {
		List<UserDO>  userDo = userDAO.selectAllSJ(userQuery);
		if(CollectionUtils.isEmpty(userDo))
		 {
			 return null;
		 }
		 List<UserVO> listModel = new ArrayList<>();
		 CommonConverter.convertList(UserVO.class, userDo, listModel);
		return listModel;
	}

	public UserVO selectUserForManager(UserQuery userQuery) {
		if (null == userQuery) {
			return null;
		}
		UserDO userDo = userDAO.selectByUserNameForManage(userQuery);
		if (null == userDo) {
			return null;
		}
		UserVO UserVO = new UserVO();
		CommonConverter.convert(userDo, UserVO);
		return UserVO;
	}

	public UserVO selectUserByUserIdForApp(UserQuery userQuery) {
		if (null == userQuery) {
			return null;
		}
		UserDO userDo = userDAO.selectUserByUserIdForApp(userQuery);
		if (null == userDo) {
			return null;
		}
		UserVO UserVO = new UserVO();
		CommonConverter.convert(userDo, UserVO);
		return UserVO;
	}

	public List<UserVO> getAllTeacher(UserQuery userQuery) {

		if (null == userQuery) {
			return null;
		}
		List<UserVO> listModel = new ArrayList<>();
		List<UserDO> doList = userDAO.selectTeacherList(userQuery);
		if (CollectionUtils.isEmpty(doList)) {
			return null;
		}
		CommonConverter.convertList(UserVO.class, doList, listModel);
		return listModel;
	}

	public UserVO selectTeacherByName(String nickName) {
		UserDO userDo = userDAO.selectTeacheByName(nickName);
		if (null == userDo) {
			return null;
		}
		UserVO UserVO = new UserVO();
		CommonConverter.convert(userDo, UserVO);
		return UserVO;
	}

	public long selectTeachCount(UserQuery userQuery) {
		return userDAO.selectTeacherCount(userQuery);
	}

	public PlatformUserVO selectplatformUser(PlatformUserQuery query) {
		if(query == null)
		{
			return null;
		}
		PlatformUserDO userDo = platformUserDAO.selectplatformUser(query);
		if(userDo == null)
		{
			return null;
		}
		PlatformUserVO model = new PlatformUserVO();
		CommonConverter.convert(userDo,model);
		return model;
	}

	public Map<String, UserVO> selectUserByIds(UserQuery query) {
		if (null == query) {
			return null;
		}
		List<UserVO> listModel = new ArrayList<>();
		List<UserDO> doList = userDAO.selectUserByUserIds(query);
		if (CollectionUtils.isEmpty(doList)) {
			return null;
		}
		CommonConverter.convertList(UserVO.class, doList, listModel);
		Map<String, UserVO> userMap = new HashMap<String, UserVO>();
		for(UserVO model : listModel){
			userMap.put(model.getUserId(), model);
		}
		return userMap;
	}
	
	public List<UserVO> selectUserListByIds(UserQuery query) {
		if (null == query) {
			return null;
		}
		List<UserVO> listModel = new ArrayList<>();
		List<UserDO> doList = userDAO.selectUserByUserIds(query);
		if (CollectionUtils.isEmpty(doList)) {
			return null;
		}
		CommonConverter.convertList(UserVO.class, doList, listModel);
		return listModel;
	}

	public List<UserVO> selectAllClientId() {
		List<UserDO> dolList = userDAO.selectAllClientId();
		if(CollectionUtils.isEmpty(dolList))
		{
			return null;
		}
		List<UserVO> modelList = new ArrayList<>();
		CommonConverter.convertList(UserVO.class,dolList,modelList);
		return modelList;
	}

	public List<UserVO> getUserByNickName(String nickName) {

		List<UserDO> listDao = userDAO.selectByUserNameForList(nickName);
		if (CollectionUtils.isEmpty(listDao)) {
			return null;
		}
		List<UserVO> modelList = new ArrayList<>();
		CommonConverter.convertList(UserVO.class, listDao, modelList);
		return modelList;
	}

	public int deleteUserInfo(String userId) {
		return userDAO.deleteUserInfo(userId);
	}

	public int deleteThirdUser(String userId) {
		return thirdLoginDAO.deleteUser(userId);
	}
}
