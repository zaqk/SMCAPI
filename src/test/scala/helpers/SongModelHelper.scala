package helpers

import scala.collection.JavaConverters._
import scala.collection.immutable._

import java.util.HashMap

import com.smcapi.rest.dao.SongManagerDao
import com.smcapi.rest.model.song.Song
import com.smcapi.rest.model.song.SongRequest
import com.smcapi.rest.model.song.SongResponse

object SongModelHelper {
  val attr1 = Map("attr1" -> java.lang.Boolean.TRUE, "attr2" -> java.lang.Boolean.TRUE, "attr3" -> java.lang.Boolean.TRUE).asJava
  val attr2 = Map("attr1" -> java.lang.Boolean.TRUE, "attr2" -> java.lang.Boolean.FALSE, "attr3" -> java.lang.Boolean.TRUE).asJava
  val attr3 = Map("attr1" -> java.lang.Boolean.FALSE, "attr2" -> java.lang.Boolean.FALSE, "attr3" -> java.lang.Boolean.FALSE).asJava
  
  val attr1HashMap = new java.util.HashMap[String,java.lang.Boolean](attr1)
  val attr2HashMap = new java.util.HashMap[String,java.lang.Boolean](attr1)
  val attr3HashMap = new java.util.HashMap[String,java.lang.Boolean](attr1)
  
  val song1 : Song = new Song("id1", "songname1", "link1", "videoId1", attr1HashMap)
  val song2 : Song = new Song("id2", "songname2", "link2", "videoId2", attr2HashMap)
  val song3 : Song = new Song("id2", "songname2", "link2", "videoId2", attr3HashMap)
  
  def getSongList() : java.util.List[Song] = {
    return List(song1, song2, song3).asJava
  }
  
  def getSongRequest() : SongRequest = {
    return new SongRequest(attr1HashMap)
  }
  
}