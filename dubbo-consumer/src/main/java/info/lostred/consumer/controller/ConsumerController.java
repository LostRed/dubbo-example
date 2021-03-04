package info.lostred.consumer.controller;

import info.lostred.api.pojo.User;
import info.lostred.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @DubboReference(version = "1.0")
    private UserService userService;

    @GetMapping("/dubbo/get/{userId}")
    public User getUserById(@PathVariable("userId") Integer userId) {
        return userService.selectById(userId);
    }
}
