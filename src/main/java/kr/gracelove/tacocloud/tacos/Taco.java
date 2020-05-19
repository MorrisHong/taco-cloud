package kr.gracelove.tacocloud.tacos;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by GraceLove on 2020/05/18.
 * Contact : govlmo91@gmail.com
 */
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Taco {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date createdAt;
    @NotNull
    @Size(min = 5, message = "이름은 적어도 다섯글자 이상으로 해주세요.")
    private String name;

    @ManyToMany(targetEntity = Ingredient.class)
    @Size(min = 1, message = "재료는 적어도 한가지 이상 선택해주세요.")
    private List<Ingredient> ingredients;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }

}
