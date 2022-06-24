package finalibre.learning.model

import java.sql.Timestamp

case class PageInstructor(
                     pageInsId : Long,
                     pageId : Long,
                     instructor : String,
                     firstEdit : Timestamp,
                     lastEdit : Timestamp
                     )
