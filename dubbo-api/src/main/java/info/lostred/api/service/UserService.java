package info.lostred.api.service;

import info.lostred.api.pojo.User;

public interface UserService {
    User selectById(Integer userId);
}
