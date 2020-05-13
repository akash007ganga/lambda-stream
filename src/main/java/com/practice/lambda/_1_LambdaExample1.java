package com.practice.lambda;

public class _1_LambdaExample1 {

	public static void main(String[] args) {
		startThreadWithoutLambda();
		startThreadWithLambda();
		
		System.out.println("Main Thread");
	}
	
	/**
	 * Start thread without lambda.
	 */
	public static void startThreadWithoutLambda() {
		Thread th = new Thread(new Runnable() {
			public void run() {
				System.out.println("Typical example without Lambda");
			}
		});
		th.start();
	}
	
	/**
	 * Start thread with lambda.
	 */
	private static void startThreadWithLambda() {
		Thread th = new Thread(() -> System.out.println("Typical example with Lambda"));
		th.start();
	}

}
