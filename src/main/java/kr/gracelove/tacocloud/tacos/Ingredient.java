package kr.gracelove.tacocloud.tacos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by GraceLove on 2020/05/18.
 * Contact : govlmo91@gmail.com
 */

@Getter
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
