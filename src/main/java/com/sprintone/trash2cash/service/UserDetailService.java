package com.sprintone.trash2cash.service;

import com.sprintone.trash2cash.dto.UserDetailDTO;

public interface UserDetailService {

    public String saveUserDetails(UserDetailDTO userDetailDTO);

    public String findUserByNumber(int telephone);
}
