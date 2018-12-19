package com.jb.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "buyercloudprovider")//声明当前接口时一个feign客户端
public interface BuyerServiceFeign extends BuyerApiService {
}
