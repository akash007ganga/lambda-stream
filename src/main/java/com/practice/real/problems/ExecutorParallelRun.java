package com.practice.real.problems;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorParallelRun {
	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService =    Executors.newScheduledThreadPool(1);
		scheduledExecutorService.scheduleAtFixedRate(new Job(), 0, 5, TimeUnit.SECONDS);
	}
}


class Job implements Runnable {
	
	Job() {
		System.out.println("Job Started");
	}
	
	@Override
	public void run() {
		System.out.println("Running");
	}
}


