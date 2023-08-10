package com.ivoyant.userservice.service;

import com.ivoyant.userservice.dto.ResponseDto;
import com.ivoyant.userservice.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
