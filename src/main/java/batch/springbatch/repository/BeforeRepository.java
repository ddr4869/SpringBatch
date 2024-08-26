package batch.springbatch.repository;

import batch.springbatch.entity.BeforeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeforeRepository extends JpaRepository<BeforeEntity, Long> {
}
