package serverTest.demo.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder    // infoDTO.~~~.id~~ 생성자를...불러준다...Build -> 생성자를 만들어준다...
@Getter
@Setter     // 겟셋 생성
@JsonInclude(JsonInclude.Include.NON_NULL)  // dto의 json화
@AllArgsConstructor
public class InfoDTO {

    private int id;
    private String name;
    private String role;

}