package finalibre.learning.model

object PageContentType extends Enumeration {
  type PageContentType = Value
  protected case class Val(val strName : String) extends super.Val {
    override def toString = strName
  }

  val Header = Val("Header")
  val Text = Val("Text")
  val Image = Val("Image")
  val ContentList = Val("List")
  val ListEntry = Val("ListEntry")

  val allPageContentTypes = List(Header, Text, Image, ContentList, ListEntry)

  def fromString(strName : String) = allPageContentTypes.find(_.strName == strName).get


}
