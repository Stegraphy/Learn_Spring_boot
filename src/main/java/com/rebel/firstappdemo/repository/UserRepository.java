package com.rebel.firstappdemo.repository;

import com.rebel.firstappdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link User} {@link Repository}
 */
@Repository
public class UserRepository {
    /**
     * 采用内存型的存储方式-->
     */

    private final ConcurrentMap<Integer,User> repository
            = new ConcurrentHashMap<>();

    private final  static AtomicInteger idGenerator
            = new AtomicInteger();
    /**
     * 保存对象
     * @param  user {@link User} 对象
     * @return 如果保存成功，返回<code>true</code>,
     *                  否则，返回<code>false</code>
     */

    public boolean save(User user){
       // boolean success = false;
        //ID从1开始
        Integer id = idGenerator.incrementAndGet();
        //设置ID
        user.setId(id);
        //如果返回为null则说明保存成功
       // repository.put(id,user);
        return   repository.put(id,user)==null;
    }

    /**
     * 返回所有用户列表
     * @return 所有用户列表
     */
    public Collection<User> findAll() {
        return  repository.values();
    }
}
