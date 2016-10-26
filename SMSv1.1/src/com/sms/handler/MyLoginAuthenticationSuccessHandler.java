package com.sms.handler;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class MyLoginAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	public MyLoginAuthenticationSuccessHandler() {
		super();
	}
      
	public MyLoginAuthenticationSuccessHandler(String defaultTargetUrl) {
		setDefaultTargetUrl(defaultTargetUrl);
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String auths = "";
		String redirectUrl = "/welcome";
		if (session != null) {
			Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
			for (GrantedAuthority grantedAuthority : authorities) {
				if(!grantedAuthority.getAuthority().equals("")){
					auths = auths + ","+ grantedAuthority.getAuthority();
				}else{
					redirectUrl = "/login?error=User is not Authorized.";
					break;
				}
			}
			getRedirectStrategy().sendRedirect(request, response, redirectUrl);
		} else {
			super.onAuthenticationSuccess(request, response, authentication);
		}
	}
}