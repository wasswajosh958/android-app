package ug.ac.ndejje.ndejje.ndejje.welcome

data class Student(val id: Int,
                   val name: String,
                   val regNumber: String,
                   val programme: String,
                   val profileImageId: Int,
                   val isVerified: Boolean = false
)
