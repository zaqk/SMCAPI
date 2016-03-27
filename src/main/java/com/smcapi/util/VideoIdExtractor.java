package com.smcapi.util;

public class VideoIdExtractor {
		
		private String id;
		/**
		 * @param the youtube url
		 * Example: https://www.youtube.com/watch?v=QRv2_zAPrhc or http://youtu.be/FdeioVndUhs
		 * 
		 */
		public String getVideoId(String link){
			
			if(link.contains("youtu.be") && link.charAt(0) != '/'){//shortened url
				for(int i = 0, n = link.length() ; i < n ; i++) {
					char c = link.charAt(i);
					if(c == '/'){
						if(link.charAt(i - 1) == 'e'){
							id = link.substring(i + 1, i +12);
						}
					}
				}
			}
			else if(link.contains("youtube.com")){
				for(int i = 0, n = link.length() ; i < n ; i++) {//full length url
				    char c = link.charAt(i);
				    if(c == 'v'){
				    	id = link.substring(i+2, i+13);
				    	break;
				    }
				}
				
			}else{
				id = "7VE3NoWhROc"; //give a generic video ID. So far ID is only used to obtain thumbnail.
			}
			return id;
		}
}
