package myjava.servletpractice.web.frontcontroller.v3.controller;

import myjava.servletpractice.web.frontcontroller.v3.ControllerV3;
import myjava.servletpractice.domain.member.Member;
import myjava.servletpractice.domain.member.MemberRepository;
import myjava.servletpractice.web.frontcontroller.ModelView;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        return mv;
    }
}