package taehyeon.brothers.writeln_backend.domain

import jakarta.persistence.*

@Entity
@Table(name = "tags")
class Tag(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "diary_id")
    var diaryId: Long = 0,

    @Column(name = "content", length = 100)
    var content: String
)
