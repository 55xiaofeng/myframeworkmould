package com.myframework.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class IRedisComm {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public boolean setmessage(String indto) {
        return false;
    }

    public boolean setredis() {
        // set(key,value,outtime,单位)
        stringRedisTemplate.opsForValue().set("key1", "测试存入redis");
//        stringRedisTemplate.opsForValue().set("key1", "测试存入redis", 60, TimeUnit.SECONDS);
        return true;
    }

    public String getredis(String into) {
        return   stringRedisTemplate.opsForValue().get(into);
    }
}
