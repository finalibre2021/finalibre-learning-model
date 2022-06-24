package finalibre.learning.model

case class Course(
                 courseId : Long,
                 universalId : String,
                 name : String,
                 description : String,
                 isPublished : Boolean,
                 index : Int
                 ) {
  var canUnPublish = true
  var canDelete = true

}
