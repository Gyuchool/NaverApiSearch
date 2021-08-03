package com.springshop.naverapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class UserTime {

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(nullable = false)
    private User user;

    @Column(nullable = false)
    private long totalTime;

    @Column(nullable = false, columnDefinition = "bigint default 0") //중간에 추가되므로 이미 만들어진 테이블에서
    //count를 0부터 시작하겠다, nullable false이므로
    private long numberOfCall;

    public UserTime(User user, long totalTime, long numberOfCall) {
        this.user = user;
        this.totalTime = totalTime;
        this.numberOfCall = numberOfCall;
    }

    public void updateTotalTime(long totalTime, long numberOfCall) {
        this.totalTime = totalTime;
        this.numberOfCall = numberOfCall;
    }
}