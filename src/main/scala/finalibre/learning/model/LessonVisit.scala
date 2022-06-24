package finalibre.learning.model

import java.sql.Timestamp

case class LessonVisit(
                      userId : Long,
                      lessonId : Long,
                      pageId : Long,
                      visitTime : Timestamp
                      )
