package com.mbc.chew.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MemberInterceptor extends HandlerInterceptorAdapter{
//�˹��� ���� ,Controller �������� �α��ε���,������ ���� �Ǻ�.
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	
	HttpSession hs = request.getSession(false);
	
	if (hs == null || hs.getAttribute("id") == null) {
        // ������ ���ų�, ���ǿ� "id" �Ӽ��� ������ �α��ε��� ���� ����
        System.out.println("[Interceptor] ��α��� ����� ���� �õ�: " + request.getRequestURI());
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("<script>");
        response.getWriter().println("alert('�α����� �ʿ��մϴ�.');");
        response.getWriter().println("location.href='" + request.getContextPath() + "/loginput';");
        response.getWriter().println("</script>");
        response.getWriter().flush();
        return false;
    }
	
	
	String loginId = (String) hs.getAttribute("id");
    if (!"admin".equals(loginId)) {
        // �α����� ������ ID�� "admin"�� �ƴ�
        System.out.println("�߸�������:������ ���� �����Դϴ�" + loginId + ", URI: " + request.getRequestURI());
        response.setContentType("text/html; charset=UTF-8"); 
        response.getWriter().println("<script>");
        response.getWriter().println("alert('���ٵ� �����Դϴ�(����������)');");
        response.getWriter().println("history.back();");
        response.getWriter().println("</script>");
        response.getWriter().flush(); // ���� ��� ����
        return false; 
    }
    System.out.println("������(" + loginId + ")�� �ȳ��ϼ���:" + request.getRequestURI());
    return true;
		
		
		
		
	}
}
