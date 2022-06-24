package finalibre.learning.model

case class Page(
               pageId : Long,
               courseId : Long,
               lessonId : Option[Long],
               lessonIndx : Option[Int],
               header : String,
               descriptionGroup : Option[Long],
               assignment : Option[Long],
               assignmentEnabled : Int
               ) {
  var canDelete = false

}
