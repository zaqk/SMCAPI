package com.smcapi.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.smcapi.util.VideoIdExtractor;

public class VideoIdExtractorTest {
	private VideoIdExtractor extractor = new VideoIdExtractor();
	private int videoIdLength = 11;//all youtube id's are 11 chars
	

	@Test
	public void videoIdSyntaxCheck(){
		String youtubeLink1 = "https://www.youtube.com/watch?v=2kJ35DE4vD0&index=6&list=RDr3VS5xmuQ90";
		String youtubeLink2 = "https://www.youtube.com/watch?v=QRv2_zAPrhc";
		String youtubeLink3 = "https://www.youtube.com/watch?v=HNBFupsEGwo";
		String youtubeLink4 = "https://www.youtube.com/watch?v=68K0aE_4Y5M&list=PLGznEl712WelrK7QCmj0VLoWAausboL5D";
		String youtubeLink5 = "https://www.youtube.com/watch?v=V1WL9PYvtsw&list=PLGznEl712WelrK7QCmj0VLoWAausboL5D&index=143";
		
		String id1 = extractor.getVideoId(youtubeLink1);
		String id2 = extractor.getVideoId(youtubeLink2);
		String id3 = extractor.getVideoId(youtubeLink3);
		String id4 = extractor.getVideoId(youtubeLink4);
		String id5 = extractor.getVideoId(youtubeLink5);
		
		//make sure id is not null
		assertNotNull(id1);
		assertNotNull(id2);
		assertNotNull(id3);
		assertNotNull(id4);
		assertNotNull(id5);
		
		//make sure id is 11 chars long
		assertEquals(videoIdLength, id1.length());
		assertEquals(videoIdLength, id2.length());
		assertEquals(videoIdLength, id3.length());
		assertEquals(videoIdLength, id4.length());
		assertEquals(videoIdLength, id5.length());
		
		
		//make sure id does not contain invalid chars
		assertTrue(id1.matches("([a-zA-Z0-9\\_\\-]+)"));
		assertTrue(id2.matches("([a-zA-Z0-9\\_\\-]+)"));
		assertTrue(id3.matches("([a-zA-Z0-9\\_\\-]+)"));
		assertTrue(id4.matches("([a-zA-Z0-9\\_\\-]+)"));
		assertTrue(id5.matches("([a-zA-Z0-9\\_\\-]+)"));
	}
}