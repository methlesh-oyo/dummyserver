package com.example.dummyserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/main/auth/")
public class LoginSignUpController {

    @PostMapping("signup")
    public HashMap<String, Object> signupRequest(@RequestBody HashMap<String, String> signupRequest) {
        String phoneNumber = signupRequest.get("phone");
        String deviceType = signupRequest.get("device_type");
        String deviceAgent = signupRequest.get("device_agent");

        HashMap<String, Object> response = new HashMap<String, Object>();
        response.put("success", true);
        response.put("message", "OTP sent successfully");
        response.put("is_registered", false);
        

        return response;
    }

    @PostMapping("verify-otp")
    public HashMap<String, Object> verifyOtp(@RequestBody HashMap<String, String> signupRequest) {
        String phoneNumber = signupRequest.get("phone");
        String otpValue = signupRequest.get("otp");
        String deviceType = signupRequest.get("device_type");
        String deviceAgent = signupRequest.get("device_agent");

        HashMap<String, Object> response = new HashMap<String, Object>();
        System.out.println(otpValue);

        if(otpValue.equals("1234")) {
            response.put("success", true);
            response.put("message", "Logged in Succesfully");
        }
        else{
            response.put("success", false);
            response.put("message", "Invalid OTP. Please try again");
        }
        return response;
    }

    @PostMapping("signup-details")
    public HashMap<String, Object> signUpDetails(@RequestBody HashMap<String, String> signupRequest) {
//        String phoneNumber = signupRequest.get("phone");
//        String otpValue = signupRequest.get("otp");
//        String deviceType = signupRequest.get("device_type");
//        String deviceAgent = signupRequest.get("device_agent");

        HashMap<String, Object> response = new HashMap<String, Object>();

//        if(otpValue=="1234") {
//            response.put("success", true);
//            response.put("message", "Logged in Succesfully");
//        }
//        else{

        response.put("success", true);
        response.put("message", "Event details submitted successfully");
//        }
        return response;
    }

}
