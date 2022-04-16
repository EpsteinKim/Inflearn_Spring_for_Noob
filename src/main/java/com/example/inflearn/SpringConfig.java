package com.example.inflearn;

import com.example.inflearn.repository.MemberRepository;
import com.example.inflearn.repository.MemoryMemberRepository;
import com.example.inflearn.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
