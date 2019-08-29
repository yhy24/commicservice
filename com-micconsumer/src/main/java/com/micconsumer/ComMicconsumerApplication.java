package com.micconsumer;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ComMicconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComMicconsumerApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
//	随机请求
	/*@Bean
	public IRule iRule() {
		return new RandomRule();
	}*/
//	轮询请求
	/*@Bean
	public IRule iRule() {
		return new RoundRobinRule();
	}*/
//	尝试请求
@Bean
public IRule iRule() {
	return new RetryRule();
}

}
