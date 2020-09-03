package com.oceanbai.blog.utils;

import org.springframework.stereotype.Component;

/**
 * @author ocean.bai
 * @date 2020/9/1
 */
@Component
public class SnowFlakeIdUtil {
   private final SnowFlakeIdGenerator idGenerator = new SnowFlakeIdGenerator(1, 1);

   public long nextId(){
      return idGenerator.nextId();
   }
}
