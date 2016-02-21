package com.smcapi.util

import org.scalatest._
import helpers.YoutubeTestHelper

class VideoIdExtractorTest extends FunSuite with BeforeAndAfter with ShouldMatchers {  
  
  var extractor : VideoIdExtractor = _
  
  before {
    extractor = new VideoIdExtractor
  }
  
  test("validate video id's are not null") {
       YoutubeTestHelper.urls.foreach(
        url => (extractor getVideoId(url)) should not be (null) 
       )
  }

  test("validate video id's are correct length") {
       YoutubeTestHelper.urls.foreach(
        url => (extractor getVideoId(url) length()) should be (YoutubeTestHelper.idLength) 
       )
  }
  
  test("validate video id's contain only valid characters") {
       YoutubeTestHelper.urls.foreach(
        url => (extractor getVideoId(url) matches (YoutubeTestHelper.idPattern.regex)) should be (true) 
       )
  }  
  
}