package com.myframework.code.controller;

import com.myframework.code.service.IRedisComm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class RedisTest {
    private Logger logger = LoggerFactory.getLogger(RtsFileManager.class);
    @GetMapping("/redisTest")
    public String redisTest() {
        return "redisTest";
    }

    @Autowired
    private IRedisComm iRedisComm;

//    @ApiOperation(value = "向redis插入信息")
//    @RequestMapping(value = "setredis", method = RequestMethod.POST)
    @GetMapping("/setredis_get")
    public boolean setredis_get() {
        return this.iRedisComm.setredis();
    }

//    @ApiOperation(value = "获取redis信息")
//    @RequestMapping(value = "getredis", method = RequestMethod.GET)
    @GetMapping("/getredis_get")
    public String getredis_get(@RequestParam(value = "into") String into) {
        logger.info("into=["+into+"]");
        return this.iRedisComm.getredis(into);
    }
}
