package com.dsc.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.dsc.hr.zz.mapper",
						  "com.dsc.hr.gjn.mapper",
						  "com.dsc.hr.zzq.mapper",
						  "com.dsc.hr.lx.mapper",
						  "com.dsc.hr.lxp.mapper"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
	