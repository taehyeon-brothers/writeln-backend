package taehyeon.brothers.writeln_backend.domain

import jakarta.persistence.*

@Entity
@Table(name = "diaries")
class Diary(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "user_id", nullable = false)
    var userId: Long,

    @Column(name = "title", length = 100, nullable = false)
    var title: String,

    @Column(name = "content", length = 4000, nullable = false)
    var content: String
)
