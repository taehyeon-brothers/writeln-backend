package taehyeon.brothers.writeln_backend.domain

import jakarta.persistence.*

@Entity
@Table(name = "tags")
class Tag(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "diary_id", foreignKey = ForeignKey(ConstraintMode.NO_CONSTRAINT))
    var diary: Diary,

    @Column(name = "name", length = 100)
    var name: String
)
