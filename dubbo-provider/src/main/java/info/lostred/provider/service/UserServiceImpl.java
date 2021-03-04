package info.lostred.provider.service;

import info.lostred.api.pojo.User;
import info.lostred.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class UserServiceImpl implements UserService {
    @Override
    public User selectById(Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUsername("张三");
        System.out.println("接收到的userId：" + userId);
        return user;
    }
}
