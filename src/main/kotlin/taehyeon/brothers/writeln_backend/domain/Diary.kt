package taehyeon.brothers.writeln_backend.domain

import jakarta.persistence.*

@Entity
@Table(name = "diaries")
class Diary(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var user: User,

    @Column(name = "title", length = 100, nullable = false)
    var title: String,

    @Column(name = "content", length = 4000, nullable = false)
    var content: String
)
