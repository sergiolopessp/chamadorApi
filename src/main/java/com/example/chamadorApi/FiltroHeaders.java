package com.example.chamadorApi;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class FiltroHeaders implements ClientRequestFilter {

	@Override
	public void filter(ClientRequestContext requestContext) throws IOException {
		ServletRequestAttributes currentRequestAttributtes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		
		HttpServletRequest request = currentRequestAttributtes.getRequest();
		
		Enumeration<String> e = request.getHeaderNames();
		
		while (e.hasMoreElements()) {
			String header = e.nextElement();
			
			if (header.startsWith("x-")) {
				requestContext.getHeaders().add(header, request.getHeader(header));
			}
		}
		
	}
	
	

}
