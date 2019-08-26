package com.aop.helper;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.aop.model.User;
import com.google.appengine.api.users.UserService;

@Component
@Aspect
@EnableAspectJAutoProxy
public class InterceptAspect {
	
	
  @After("execution(* com.aop.controller.LoginController.registerSuccess(..) ) )")
  public void after(JoinPoint joinpoint) {
			  System.out.println("After register it was called successfully");
  }
}
