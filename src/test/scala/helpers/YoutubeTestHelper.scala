package helpers

object YoutubeTestHelper {
  
  val idPattern = """([a-zA-Z0-9\_\-]+)""".r
  
  val idLength : Int = 11
  
  
  val urls: List[String] = List(
      "https://www.youtube.com/watch?v=2kJ35DE4vD0&index=6&list=RDr3VS5xmuQ90", 
      "https://www.youtube.com/watch?v=QRv2_zAPrhc", 
      "https://www.youtube.com/watch?v=HNBFupsEGwo",
      "https://www.youtube.com/watch?v=68K0aE_4Y5M&list=PLGznEl712WelrK7QCmj0VLoWAausboL5D",
      "https://www.youtube.com/watch?v=V1WL9PYvtsw&list=PLGznEl712WelrK7QCmj0VLoWAausboL5D&index=143",
      "https://www.youtube.com/watch?v=joMbdOOw7as",
      "https://www.youtube.com/watch?v=7VE3NoWhROc",
      "https://www.youtube.com/watch?v=KMOoNlD_bNg&list=PLGznEl712WengM1bHhDP2dRpw1qER3WEQ",
      "https://www.youtube.com/watch?v=oFOJhcLW5BA&list=PLGznEl712WengM1bHhDP2dRpw1qER3WEQ&index=35",
      "https://www.youtube.com/watch?v=sVr4Xj9t1fM&list=PLGznEl712WengM1bHhDP2dRpw1qER3WEQ&index=39",
      "https://www.youtube.com/watch?v=JqhZXNt7xvw&index=171&list=PLGznEl712WencwBJI3Idxggb58SmnH38z",
      "http://youtu.be/FdeioVndUhs",
      "http://youtu.be/ULupWyADZYI"
      )
  
}