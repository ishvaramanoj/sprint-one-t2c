package com.sprintone.trash2cash.controller;

import com.sprintone.trash2cash.dto.UserNumberDTO;
import com.sprintone.trash2cash.dto.UserOTPDTO;
import com.sprintone.trash2cash.service.IMPL.UserDetailServiceIMPL;
import com.sprintone.trash2cash.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("chakra_sutra/trash_2_cash")
@CrossOrigin
public class UserOTPController {

    @Autowired
    private UserDetailService userDetailService;

    @Autowired
    private UserDetailServiceIMPL userDetailServiceIMPL;

    private String gene;

    @PostMapping("/number")
    public String verifyNumber(@RequestBody UserNumberDTO userNumberDTO){
     String generated = userDetailService.findUserByNumber(userNumberDTO.getTelephone());
     gene = generated;
     userDetailServiceIMPL.setVariableOne(gene);
     return gene;
    }

    @PostMapping("/verify")
    public String recieveOTP(@RequestBody UserOTPDTO userOTPDTO) {
        String variableTwo = userOTPDTO.getOtp();
        boolean result = userDetailServiceIMPL.compareVariables(variableTwo);
        if (result) {
            return "otp verification done";
        } else {
            return "invalid otp entered";
        }
    }

}
