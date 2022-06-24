package finalibre.learning.model

case class Image(
                imageId : Long,
                bytes : Array[Byte],
                contentType : String
                )
