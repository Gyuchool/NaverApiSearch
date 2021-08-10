package com.springshop.naverapi.mail;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @PostMapping("/api/email") // 이메일 인증 코드 보내기
    public String emailAuth(@RequestBody Map<String, String> email) throws Exception {
        mailService.sendSimpleMessage(email.get("email"));

        return "success";
    }

    @PostMapping("/api/verifyCode") // 이메일 인증 코드 검증
    public String verifyCode(@RequestBody Map<String, String> code) {
        if(MailService.ePw.equals(code.get("code"))) {
            return "success";
        }
        else{
            return "failed";
        }
    }
}
