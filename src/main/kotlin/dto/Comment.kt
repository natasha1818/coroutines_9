package dto

 data class Comment(
val id: Long,
val author: Author,
val authorAvatar: String,
val authorId: Long,
val content: String,
val published: Long,
val likedByMe: Boolean,
val likes: Int = 0,
)
