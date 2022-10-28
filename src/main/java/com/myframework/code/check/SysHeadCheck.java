package com.myframework.code.check;

import com.myframework.code.ret.RetMyRoot;
import com.myframework.code.rev.MyRoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysHeadCheck {

    private Logger logger = null;

    public boolean controlone(MyRoot myRoot, RetMyRoot retMyRoot){

        logger = LoggerFactory.getLogger(SysHeadCheck.class);

        return false;
    }
}
