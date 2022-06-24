package finalibre.learning.model
import Lesson.LessonType._

case class Lesson(
                 lessonId : Long,
                 courseId : Long,
                 courseIndex : Option[Int],
                 points : Int,
                 name : String,
                 description : String,
                 lessonType : LessonType
                 ) {
  var canDelete = false

}

object Lesson {

  object LessonType extends Enumeration {
    type LessonType = Val
    case class LessonTypeValue(idString : String, name : String, description : String) extends Val
    val Normal = LessonTypeValue("normal", "Normal", "Used as default lesson type")
    val Speed = LessonTypeValue("speed", "Speed-run", "Usually has relatively easy assignments, but the key is to solve them fast, in order to gain extra points")
    val Engineering = LessonTypeValue("engineering", "Engineering", "Used for constructing large and coherent solutions")

    val allValues = List(Normal, Speed, Engineering)

  }

}
