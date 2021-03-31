package com.practice.encoding;

import java.io.UnsupportedEncodingException;

public class PrintUmlautCharInISO {

	public static void main(String[] args) {
		String umlaut = "ä, ö, ü, Ä, Ö, Ü";
		
		//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Properties.html#load(java.io.InputStream)

        try {
        	System.out.println("UTF-8 umlaut: " + new String(umlaut.getBytes("UTF-8")));
			System.out.println("UTF-8 umlaut: " + new String(umlaut.getBytes("UTF-8"), "UTF-8"));
			System.out.println("ISO-8859-1 umlaut: " + new String(umlaut.getBytes("ISO-8859-1")));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        

	}

}
