package helpers

object YoutubeTestHelper {
  
  val idPattern = """([a-zA-Z0-9\_\-]+)""".r
  
  val idLength : Int = 11
  
  
  val urls: List[String] = List(
      "https://www.youtube.com/watch?v=2kJ35DE4vD0&index=6&list=RDr3VS5xmuQ90", 
      "https://www.youtube.com/watch?v=QRv2_zAPrhc", 
      "https://www.youtube.com/watch?v=HNBFupsEGwo",
      "https://www.youtube.com/watch?v=68K0aE_4Y5M&list=PLGznEl712WelrK7QCmj0VLoWAausboL5D",
      "https://www.youtube.com/watch?v=V1WL9PYvtsw&list=PLGznEl712WelrK7QCmj0VLoWAausboL5D&index=143"
      )
  
}