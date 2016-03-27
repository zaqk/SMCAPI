package com.smcapi.util

import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.mockito.Mock;
import org.scalatest._

import org.apache.ibatis._

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class AttributeTypeHandlerTest extends FunSuite with BeforeAndAfter with ShouldMatchers{
  
  @Mock
  var pstmt : PreparedStatement = _//marked annotatively to resolve ambiguous import bug
  
  @Mock
  var resultSet : ResultSet = _
  
  @Mock
  var callable : CallableStatement = _
 
  
  /*
  test("getNullableResult() :: validate"){
     val ath = new AttributeTypeHandler
     ath.setNonNullParameter(pstmt, 1, java.lang.Boolean.FALSE, 
    
    
  }
  */
}