package myjava.servletpractice.web.frontcontroller.v3.controller;

import myjava.servletpractice.domain.member.Member;
import myjava.servletpractice.domain.member.MemberRepository;
import myjava.servletpractice.web.frontcontroller.ModelView;
import myjava.servletpractice.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member",member);
        return mv;
    }
}
