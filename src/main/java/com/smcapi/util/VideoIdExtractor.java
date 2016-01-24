package com.smcapi.util;

public class VideoIdExtractor {
		
		private String id;
		
		public String getVideoId(String link){
			
			for(int i = 0, n = link.length() ; i < n ; i++) { 
			    char c = link.charAt(i);
			    if(c == 'v'){
			    	id = link.substring(i+2, i+13);
			    	break;
			    }
			}
			return id;
		}
}
