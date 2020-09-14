package com.sgcc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(basePackages = {"com.sgcc.mapper","com.sgcc.util"})
public class SgccIntegrationDataConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgccIntegrationDataConnectApplication.class, args);
	}

}
