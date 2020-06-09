package com.lijieyao.redis;

import com.lijieyao.redis.entity.User;
import com.lijieyao.redis.utils.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        String key = "lijieyao";
        String value = "2016131245";
        long timestamp = 100000;
        // RedisUtils.set(key,value,timestamp);
        // redisTemplate.opsForValue().set(key,value);
        // System.out.println(redisTemplate.opsForValue().get(key));
        User user = new User();
        user.setUserName("李杰尧");
        user.setPassWord("1234556");
        user.setEmail("392425095@qq.com");
        user.setPhone("110");
        RedisUtils.set(key,user,timestamp);
    }

    @Test
    public void testGetRedis(){
        System.out.println(RedisUtils.get("lijieyao"));
    }
}
