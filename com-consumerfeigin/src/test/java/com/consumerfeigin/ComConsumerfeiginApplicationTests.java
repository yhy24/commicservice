package com.consumerfeigin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComConsumerfeiginApplicationTests {

	@Test
	public void contextLoads() {
		Lock lock = new ReentrantLock();
		lock.lock();
	}

}
