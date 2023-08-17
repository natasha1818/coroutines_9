package dto

data class Author(
    val id: Long,
    val name: String,
    val avatar: String,
)

data class CommentWithAuthor (
    val idAuthor: Long,
    val comment: Comment,
    val author:Author,
    val authorAvatar:String,
)