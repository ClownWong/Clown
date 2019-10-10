package cn.itsource.controller;

import cn.itsource.domain.User;
import cn.itsource.util.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试页面")
public class LoginController {

    /*登录接口*/
    @ApiOperation(value = "登录接口")
    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){
        if ("123".equals(user.getUsername())&&"123".equals(user.getPassword())){
            return AjaxResult.me().setSuccess(true).setMassage("登录成功");
        }
    return AjaxResult.me().setSuccess(false).setMassage("登录失败");
    }
}
