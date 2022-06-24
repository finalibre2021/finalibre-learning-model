package finalibre.learning.model

case class PageContent(
                      contentId : Long,
                      contentGroupId : Long,
                      index : Int,
                      contentType : String,
                      parentId : Option[Long] = None,
                      text : Option[String] = None,
                      style : Option[String] = None,
                      level : Option[Int] = None,
                      imageId : Option[Long] = None,
                      withBorder : Option[Int] = None,
                      stretched : Option[Int] = None,
                      withBackground : Option[Int] = None
                      )
