package com.fhj.dubbo.impl;

import com.fhj.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * com.fhj.dubbo.impl
 * 94936
 * 2018/1/3
 * 15:12
 * DubboDemo
 **/
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
