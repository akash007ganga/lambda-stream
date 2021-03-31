package com.practice.fun;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class AutometicClicker {

	public static void main (String[] args) {
		
		try {
			click();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void click() throws AWTException{
        Random random = new Random();
        
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm:ss a");
		
	    Robot bot = new Robot();
	    while(true){
	    	int x = random.nextInt() % 640;
	    	int y = random.nextInt() % 480;
	    	LocalDateTime date = LocalDateTime.now();
	    	System.out.println("moving ...: " + formatter.format(date));
	    	bot.mouseMove(x,y);
	    	bot.delay(1000 * 60);
	    }
	    //bot.mouseMove(x, y);
		/* bot.mousePress(InputEvent.BUTTON1_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_MASK);*/
	}
}
