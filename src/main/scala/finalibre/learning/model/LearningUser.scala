package finalibre.learning.model

case class LearningUser(
                  userId : Long,
                  initials : String,
                  userName : Option[String],
                  avatar : Option[Array[Byte]],
                  avatarFileType : Option[String]
                  )
