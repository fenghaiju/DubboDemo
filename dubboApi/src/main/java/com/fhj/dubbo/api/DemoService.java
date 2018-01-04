package com.fhj.dubbo.api;

import java.util.List;

/**
 * com.fhj.dubbo.api
 * 94936
 * 2018/1/3
 * 15:02
 * DubboDemo
 **/
public interface DemoService {
    List<String> getPermissions(Long id);
}
