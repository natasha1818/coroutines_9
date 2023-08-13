package dto

data class PostWithComments(
    val post: Post,
    val authorPost: Author,
    val comments: List<Comment>,

    )