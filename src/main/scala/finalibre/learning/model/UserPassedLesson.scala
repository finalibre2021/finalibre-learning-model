package finalibre.learning.model

import java.sql.Timestamp

case class UserPassedLesson(
                           userId : Long,
                           lessonId : Long,
                           points : Int,
                           passedTime : Timestamp,
                           startTime : Timestamp,
                           timedRank : Option[Int],
                           bonusPoints : Option[Int]
                           )
