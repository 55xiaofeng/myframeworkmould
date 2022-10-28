package com.myframework.code;

		import org.mybatis.spring.annotation.MapperScan;
		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.boot.builder.SpringApplicationBuilder;
		import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.myframework.code.dao")
public class MyFrameWorkApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(MyFrameWorkApplication.class);
		logger.info("MyFrameWorkApplication run begin");
		SpringApplication.run(MyFrameWorkApplication.class, args);
		logger.info("MyFrameWorkApplication run end");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(MyFrameWorkApplication.class);
	}
}
