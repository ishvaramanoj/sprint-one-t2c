package com.sprintone.trash2cash.service.IMPL;

import com.sprintone.trash2cash.dto.UserDetailDTO;
import com.sprintone.trash2cash.entity.UserDetails;
import com.sprintone.trash2cash.repository.UserDetailrepository;
import com.sprintone.trash2cash.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserDetailServiceIMPL implements UserDetailService {

    private String variableOne;

    public String getVariableOne(){return variableOne;}

    public void setVariableOne(String variableOne){this.variableOne=variableOne;}
    public boolean compareVariables(String variableTwo){
        return variableOne.equals(variableTwo);
    }

    @Autowired
    private UserDetailrepository userDetailrepository;

    @Override
    public String saveUserDetails(UserDetailDTO userDetailDTO) {
        UserDetails userDetails = new UserDetails(
             userDetailDTO.getName(),
             userDetailDTO.getEmail(),
             userDetailDTO.getTelephone(),
             userDetailDTO.getImageLink()
        );
           userDetailrepository.save(userDetails);
        return "User Information Saved Successfully";
    }

    @Override
    public String findUserByNumber(int telephone) {
        if (userDetailrepository.existsById(telephone)){
            UserDetails userDetails = userDetailrepository.getReferenceById(telephone);
            Random random = new Random();
            int variableOne = 1000 + random.nextInt(9000);
//        int variableOne = 100_000 + random.nextInt(900_00);
            return String.valueOf(variableOne);
        }else {
            throw new RuntimeException("User not found");
        }

    }


}
