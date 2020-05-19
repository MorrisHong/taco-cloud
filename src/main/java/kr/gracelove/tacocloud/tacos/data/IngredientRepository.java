package kr.gracelove.tacocloud.tacos.data;

import kr.gracelove.tacocloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GraceLove on 2020/05/18.
 * Contact : govlmo91@gmail.com
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
