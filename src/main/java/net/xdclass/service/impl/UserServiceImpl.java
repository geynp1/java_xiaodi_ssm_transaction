package net.xdclass.service.impl;

import net.xdclass.domain.User;
import net.xdclass.mapper.UserMapper;
import net.xdclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int save(User user) {
        userMapper.save(user);

        int i = 1/0;
        return 1;
    }
}
