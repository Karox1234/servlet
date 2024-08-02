package myjava.servletpractice.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}



//이번에는 v3를 조금 변경해서 실제 구현하는 개발자들이 매우 편리하게 개발할 수 있는 v4 버전을 개발해보자
//기본적인 구조는 V3와 같다. 대신에 컨트롤러가 ModelView 를 반환하지 않고, ViewName 만 반환한다.