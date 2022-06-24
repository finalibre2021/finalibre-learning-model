package finalibre.learning.model

case class Assignment(
                       assignmentId : Long,
                       assignmentName : String,
                       contentGroup : Option[Long],
                       controlQuery : String
                     )
