package com.ping.SofaD;

import com.ping.service.HelloSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:rpc-starter.xml"})
public class SofaDApplication {

	public static void main(String[] args) {

		SpringApplication application =  new SpringApplication(SofaDApplication.class);
		ApplicationContext applicationContext = application.run(args);

		HelloSyncService helloSyncService = (HelloSyncService)applicationContext.getBean("helloSyncServiceReference");
		System.out.println(helloSyncService.saying("sync"));
	}
}
