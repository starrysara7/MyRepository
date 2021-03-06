package com.mycompany.lbnapptest.test09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/test09")
public class Test09Controller {
	private static final Logger logger = LoggerFactory.getLogger(Test09Controller.class);
	
	private A a;
	public void setA(A a) {
		logger.info("setA() 실행");
		this.a = a;
	}
	
	private B b;
	public void setB(B b) {
		logger.info("setB() 실행");
		this.b = b;
	}

	private ServiceA serviceA;
	public void setServiceA(ServiceA serviceA) {
		logger.info("setServiceA() 실행");
		this.serviceA = serviceA;
	}
		
	private ServiceB serviceB;
	public void setServiceB(ServiceB serviceB) {
		logger.info("setServiceB() 실행");
		this.serviceB = serviceB;
	}

	private ServiceC serviceC;
	public void setServiceC(ServiceC serviceC) {
		this.serviceC = serviceC;
	}

	private ServiceD serviceD;
	public void setServiceD(ServiceD serviceD) {
		this.serviceD = serviceD;
	}
	
	
	private C c;
	public void setC(C c){
		logger.info("setC() 실행");
		this.c = c;
	}
	
	
	private E e;
	public void setE(E e){
		logger.info("setE() 실행");
		this.e = e;
	}
	
	private F f;
	public void setF(F f){
		logger.info("setF() 실행");
		this.f = f;
	}
	
	
	public Test09Controller(){
		logger.info("Test09Controller 객체 생성");
	}
	
	@RequestMapping("/index")
	public String index(){
		logger.info("index 처리");
		return "test09/index";
	}
	
	@RequestMapping("/method1")
	public String method1(){
		logger.info("method1 처리");
		a.method();
		b.method();
		serviceA.method();
		serviceB.method();
		serviceC.method();
		serviceD.method();
		return "redirect:/test09/index";
	}
	
	@RequestMapping("/method2")
	public String method2(){
		logger.info("method2 처리");
		c.method();
		e.method();
		f.method();
		return "redirect:/test09/index";
	}
	
	
}
