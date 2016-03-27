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

import helpers.SongModelHelper

class SongManagerServiceTest extends FunSuite with BeforeAndAfter with ShouldMatchers with MockitoSugar{
  
  val songList = SongModelHelper.songList
  
  val songRequest = SongModelHelper.songRequest
  
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
  
  test("search() :: validate that correct error is returned for empty list"){

    when(dao.search(songRequest)).thenReturn(emptySongList.asJava)
    
    val songResponse = service.search(songRequest)
    
    songResponse.getSongs should be ('empty)
    songResponse.getErrorMessage should be (Constants.NO_RESULTS)
    
  }
  
  test("search() :: validate exception handling"){
    
    //TODO validate search() exception handling
    

    
  }
  
}