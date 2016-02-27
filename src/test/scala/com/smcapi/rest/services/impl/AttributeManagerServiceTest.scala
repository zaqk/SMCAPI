package com.smcapi.rest.services.impl

import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.scalatest._

import scala.collection.JavaConverters._
import scala.collection.immutable._

import java.util.HashMap

import com.smcapi.rest.dao.AttributeManagerDao
import com.smcapi.rest.model.attribute.AttributeResponse
import com.smcapi.util.Constants

class AttributeManagerServiceTest extends FunSuite with BeforeAndAfter with ShouldMatchers with MockitoSugar{
  
  val service = new AttributeManagerService
  val dao = mock[AttributeManagerDao]
  
  val attributeList = List("attr1", "attr2", "attr3", "attr4", "attr5").asJava
  val emptyList : List[String] = Nil
  
  before{
    service.setDao(dao)
  }
  
  test("getAttributes() :: validate attribute list is returned"){
    
    when(dao.getAttributes).thenReturn(attributeList)
    
    val attributeResponse = service.getAttributes
    
    attributeResponse.getAttributes should equal (attributeList)
    
  }
  
  test("getAttributes() :: validate correct error is returned for empty list"){
    
    when(dao.getAttributes).thenReturn(emptyList.asJava)
    
    val attributeResponse = service.getAttributes
    
    attributeResponse.getAttributes should be ('empty)
    attributeResponse.getErrorMessage should be (Constants.NO_RESULTS)
    
  }
  
  test("getAttributes() :: validate exception handling"){
    
    //TODO validate getAttributes() exception handling
    
  }
  
  
}