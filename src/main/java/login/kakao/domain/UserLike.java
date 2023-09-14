package bestChoicebackend.spring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class UserLike {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userLikeId;

    @ManyToOne(cascade = CascadeType.REMOVE) // 현재 클래스 : 목표 클래스 = N : 1
    @JoinColumn(name = "userId", nullable = false, columnDefinition = "Long")
    User userId;

    @ManyToOne(cascade = CascadeType.REMOVE) // 현재 클래스 : 목표 클래스 = N : 1
    @JoinColumn(name = "accommodationId", nullable = false, columnDefinition = "Long")
    Accommodation accommodationId;

}
