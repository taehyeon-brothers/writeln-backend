package taehyeon.brothers.writeln_backend.infrastructure

import org.springframework.data.jpa.repository.JpaRepository
import taehyeon.brothers.writeln_backend.domain.Diary

interface DiaryRepository : JpaRepository<Diary, Long>
