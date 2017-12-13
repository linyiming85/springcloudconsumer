package com.unicom.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.unicom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author linyi
 * @date 2017/12/11
 */

@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String queryUser(String userName){
        User user=new User();
        user.setUserName(userName);
        return restTemplate.getForObject("http://SERVICE-USER/query?userName="+user.getUserName(),String.class);
    }

    public String fallback(){
        return "error";
    }
}
