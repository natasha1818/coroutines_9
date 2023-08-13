package dto

data class Author(
    val id: Long,
    val name: String,
    val avatar: String,
)

data class PostWithAuthor <T>(
    val t: T ,
    val author:Author
)