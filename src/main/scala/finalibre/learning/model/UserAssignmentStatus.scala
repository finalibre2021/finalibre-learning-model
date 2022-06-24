package finalibre.learning.model

import java.sql.Timestamp

case class UserAssignmentStatus(
                               userId : Long,
                               assignmentId : Long,
                               correctSolution : Option[String],
                               wrongSolution : Option[String],
                               correctTs : Option[Timestamp]
                               )
