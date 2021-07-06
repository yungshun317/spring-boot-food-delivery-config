package yungshun.chang.springbootfooddeliveryconfig.data;

import org.springframework.data.repository.CrudRepository;
import yungshun.chang.springbootfooddeliveryconfig.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
