package org.shaalakosh.school.feignclient;

import org.shaalakosh.school.model.UserMaster;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("authorization-service")
public interface OauthFeignClient {

	@RequestMapping(value = "/userdetail/{username}", method = RequestMethod.GET)
	public UserMaster getUserDetail(@PathVariable("username") String username);

}
