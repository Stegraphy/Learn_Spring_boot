# Learn_Spring_boot
RESTful /Filter / Interceptor / Exception
### SpringBoot教程笔记

**Rest控制器**

`RestController` 注释用于定义RESTful Web服务。它提供JSON，XML和自定义响应。

**请求映射**

`RequestMapping` 注释英语定义访问REST断电的Request URL。可以定义Request方法来使用和生成对象。默认请求方法是：==GET==。

```java
@RequestMapping(value = "/test")
public ResponseEntity<Object> getTest() {}
```

**请求主体**

`@Requestbody` 注释用于定义请求正文内容类型

```java
public ResponseEntity<Object> createTest(@RequestBosy Test test) {}
```

**路径变量**

`@PathVariable` 批注用于定义自定义或动态请求URL。请求URL中的Path变量定义为花括号 `{}` ，如下所示-

``` java
public RequestEntity<Object> updateProduct(@PathVariable("id") String id) {
    
}
```

**请求参数**

`@RequestParam` 注释用于从请求URL读取请求参数。默认该情况下，它是必须参数，还可以为请求参数设置默认值，如下所示-

```java
public RequestEntity<Object> getProduct(
    @RequestParam(value = "name",required = false,defaultValue = "LinSai")String name){
    }
```



在Spring Boot中使用==拦截器==，可以在一下情况下执行操作-

* 在将请求发送到控制器之前‘
* 在将响应发送给客户端之前

要使用拦截器，需要创建它的`@Component` 类，它应该实现`HandlerrInterceptor` 接口。

以下是在拦截器上工作时应该了解的三种方法-

* `preHandle()` 方法-用于在将请求发送到控制器之前执行操作。此方法应放回`treu`，以将响应返回给客户端。
* `postHandle()`方法-用于在将响应发送到客户端之前执行操作。
* `afterCompletion()` 方法-用于在完成请求和响应后执行操作。



Soring Boot中的==过滤器==是用于拦截应用程序的HTTP请求和响应对象。通过使用滤镜，可以在两个实例上执行两个操作-

* 在请求发送到控制器之前
* 在向客户端发送响应之前













