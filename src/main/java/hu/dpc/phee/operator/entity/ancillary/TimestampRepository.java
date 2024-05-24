package hu.dpc.phee.operator.entity.ancillary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.List;

public interface TimestampRepository extends JpaRepository<Timestamps, String>, JpaSpecificationExecutor {

}
