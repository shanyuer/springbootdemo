package com.haiziyouke.api.weixin;

import com.alibaba.fastjson.JSON;
import com.haiziyouke.service.query.UserQuery;
import com.haiziyouke.service.facade.UserBiz;
import com.haiziyouke.service.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by danbai on 17/4/28.
 */
@RestController
public class HelloWorld {

    @Autowired
    private UserBiz userBiz;

    @ResponseBody
    @RequestMapping(
            value = "/user/helloworld", method = { RequestMethod.POST, RequestMethod.GET })
    public String bindWeiXinUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("sessionId", session.getId());
        UserQuery userQuery = new UserQuery();
        userQuery.setUserId("163100216258314240");
        UserVO userVO = userBiz.selectUserByUserId(userQuery);
        userVO.setIntr("sessionId:" + session.getId());
        return JSON.toJSONString(userVO);
    }

}
