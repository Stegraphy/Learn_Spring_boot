/*package com.rebel.firstappdemo.config;

import com.rebel.firstappdemo.domain.User;
import com.rebel.firstappdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import java.util.Collection;

*//**
 * 路由器函数配置
 *//*
@Configuration
public class RouterFunctionConfiguration {

    *//**
     * Servlet
     * 请求接口：ServletRequest：或者HttpServletRequest
     * 响应接口：ServletRequest 或者HttpServletResponse
     * Spring 5.0 重新定义服务请求和相应接口
     * 请求接口：ServletRequest
     * 响应接口：ServletResponse
     * 既可以支持Servlet 规范，也可以支持自定义，比如Netty（Web Server）
     * 通过本次例子为例：-->定义 GET 请求，并且返回所有用户对象 URL ： /person/find/all
     * Flux: 是0--N 个对象集合
     * Mono 是 0-1 个对象集合
     * Reactive 中的Flux或者mono是异步处理（非阻塞）
     * 集合对象基本上是同步处理（阻塞）
     * Flux 或者Mono 都是Publisher
     *//*
   @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository) {

        return  RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
                request -> {
//                    Mono<ServerResponse> response = null;

                    //返回所有的用户对象
                    Collection<User> users = userRepository.findAll();
                    Flux<User> userFlux = Flux.fromIterable(users);

                    return  ServerResponse.ok().body(userFlux,User.class);
                });


    }
}*/
 /**
  * 场景说明：
  * 定义用户模型：包括属性：用户ID和名称
  * 客户端发送POST请求，创建用户 （WEB MVC）
  * 客户端发送GET 请求，获取所有用户（Web Flux）
  **/