package org.shaalakosh.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import javax.servlet.Filter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public FilterRegistrationBean someFilterRegistration() {

		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(securityFilter());
		registration.addUrlPatterns("/*");
		registration.setName("securityFilter");
		registration.setOrder(1);
		return registration;
	}

	@Bean(name = "securityFilter")
	public Filter securityFilter() {
		return new JwtFilter();
	}
}