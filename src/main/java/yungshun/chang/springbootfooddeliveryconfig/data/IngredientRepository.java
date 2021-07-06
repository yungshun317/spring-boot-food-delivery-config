package yungshun.chang.springbootfooddeliveryconfig.data;

import org.springframework.data.repository.CrudRepository;
import yungshun.chang.springbootfooddeliveryconfig.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
