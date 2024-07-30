package myjava.servletpractice.web.frontcontroller.v2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import myjava.servletpractice.web.frontcontroller.MyView;

import java.io.IOException;

public interface ControllerV2 {
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}

//v2 목표
//v1 에서는 모든 컨트롤러에서 뷰로 이동하는 부분에 중복이 있었고, 깔끔하지 않다.
//분리하기 위해 별도로 뷰를 처리하는 객체 생성