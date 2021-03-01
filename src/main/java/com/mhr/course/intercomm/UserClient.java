package com.mhr.course.intercomm;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service")
public class UserClient {

}
