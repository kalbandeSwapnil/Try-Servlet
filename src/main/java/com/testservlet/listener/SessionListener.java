package com.testservlet.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
	public static int sessionCount = 0;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		sessionCount++;
		System.out.println("New Seession is created : sessionCount :" + sessionCount);

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		sessionCount--;
		System.out.println("Seession is destroyed  sessionCount :" + sessionCount);
	}

}
