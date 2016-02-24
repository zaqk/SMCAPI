package com.smcapi.rest.services.impl

import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.scalatest._

import scala.collection.JavaConverters._
import scala.collection.immutable._

import java.util.HashMap

import com.smcapi.rest.dao.SongManagerDao
import com.smcapi.rest.model.song.Song
import com.smcapi.rest.model.song.SongRequest
import com.smcapi.rest.model.song.SongResponse
import com.smcapi.util.Constants
//this test is a work in progress... 
class SongManagerServiceTest extends FunSuite with BeforeAndAfter with ShouldMatchers with MockitoSugar{
  
  //variables
  //TODO clean up or place logic inside helper class
  val attr1 = Map("attr1" -> java.lang.Boolean.TRUE, "attr2" -> java.lang.Boolean.TRUE, "attr3" -> java.lang.Boolean.TRUE).asJava
  val attr2 = Map("attr1" -> java.lang.Boolean.TRUE, "attr2" -> java.lang.Boolean.FALSE, "attr3" -> java.lang.Boolean.TRUE).asJava
  val attr3 = Map("attr1" -> java.lang.Boolean.FALSE, "attr2" -> java.lang.Boolean.FALSE, "attr3" -> java.lang.Boolean.FALSE).asJava
  
  val attr1HashMap = new java.util.HashMap[String,java.lang.Boolean](attr1)
  val attr2HashMap = new java.util.HashMap[String,java.lang.Boolean](attr1)
  val attr3HashMap = new java.util.HashMap[String,java.lang.Boolean](attr1)
  
  val song1 : Song = new Song("id1", "songname1", "link1", "videoId1", attr1HashMap)
  val song2 : Song = new Song("id2", "songname2", "link2", "videoId2", attr2HashMap)
  val song3 : Song = new Song("id2", "songname2", "link2", "videoId2", attr3HashMap)
  
  val songRequest : SongRequest = new SongRequest(attr1HashMap)
  
  val songList = List(song1, song2, song3).asJava
  
  val emptySongList : List[Song] = Nil
  
  val service = new SongManagerService
  val dao = mock[SongManagerDao]
  
  before{
    service.setSongDao(dao)
  }
  

  test("search() :: validate that correct songs are returned"){
  
    when(dao.search(songRequest)).thenReturn(songList)
    
    val songResponse = service.search(songRequest)
    
    songResponse.getSongs should equal (songList)
    
  }
  
  test("search() :: validate that correct error is displayed for empty list"){

    when(dao.search(songRequest)).thenReturn(emptySongList.asJava)
    
    val songResponse = service.search(songRequest)
    
    songResponse.getSongs should be ('empty)
    songResponse.getErrorMessage should be (Constants.NO_RESULTS)
    
  }
  
  test("search() :: validate exception handling"){
    /*
     var songResponse = new SongResponse
    
     when(dao.search(songRequest)).thenThrow(new RuntimeException)
     
     intercept[RuntimeException]{
      songResponse = service.search(songRequest)
     }
     
     println(songResponse.getErrorMessage)
     
     //songResponse.getSongs should be ('empty)
     //songResponse.getErrorMessage should not be empty
*/
    
  }
  
}