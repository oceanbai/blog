package com.oceanbai.blog;

import com.oceanbai.blog.utils.SnowFlakeIdGenerator;
import org.apache.catalina.LifecycleException;

import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author bby15929
 * @date 2020年09月01日15:26:25
 */
public class SnowFlakeIdTest {
    public static final ThreadPoolExecutor MESSAGE_HANDLE =
            new ThreadPoolExecutor(200
                    , 200
                    , 0
                    , TimeUnit.MINUTES
                    , new LinkedBlockingQueue<>(), new ThreadFactory() {
                final AtomicInteger count = new AtomicInteger(0);

                @Override
                public Thread newThread(Runnable r) {
                    return new Thread(r, "message_mapping_work_thread_" + count.incrementAndGet());
                }
            });

    public static void main(String[] args) throws LifecycleException, InterruptedException {
        for (int i = 0; i < 200; i++) {
            MESSAGE_HANDLE.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final SnowFlakeIdGenerator idGenerator = new SnowFlakeIdGenerator(1, 1);
        final SnowFlakeIdGenerator idGenerator1 = new SnowFlakeIdGenerator(2, 1);
        final SnowFlakeIdGenerator idGenerator2 = new SnowFlakeIdGenerator(3, 1);
        // 线程池并行执行10000次ID生成
        Map<String,String> map = new ConcurrentHashMap<>(10000 * 2);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            final int a = i;
            MESSAGE_HANDLE.execute(new Runnable() {
                @Override
                public void run() {

                    if (a % 3 == 0){
                        long id = idGenerator.nextId();
                        map.put(id + "","");
                    }else if (a % 3 == 1){
                        long id = idGenerator1.nextId();
                        map.put(id + "","");
                    }else {
                        long id = idGenerator2.nextId();
                        map.put(id + "","");
                    }

                }
            });
        }
        MESSAGE_HANDLE.shutdown();
        MESSAGE_HANDLE.awaitTermination(100000,TimeUnit.MINUTES);
        System.out.println(map.size());
        System.out.println(System.currentTimeMillis() - start);
//        long start = System.currentTimeMillis();
//        LockSupport.parkNanos(1000000000);
//        System.out.println(System.currentTimeMillis() - start);
    }
}
