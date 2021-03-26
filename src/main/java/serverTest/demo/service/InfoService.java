package serverTest.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

import lombok.AllArgsConstructor;
import serverTest.demo.dto.InfoDTO;
import serverTest.demo.entity.plimTeam;
import serverTest.demo.repository.Repo;

@AllArgsConstructor
@Service
public class InfoService {      // 로직
    private Repo repo;

    public ResponseEntity<InfoDTO> getInfo(int id) throws Exception {
        Optional<plimTeam> plim = repo.findById(id);  // plim_team 확인.. (null 여부 확인)
        if(plim.isPresent()){
            plimTeam plim2 = plim.get();    // 내용 꺼내기
            return ResponseEntity.ok(InfoDTO.builder()
                .id(plim2.getId())
                .name(plim2.getName())
                .role(plim2.getRole())
                .build());

        }else{
            throw new Exception("아이디 " + id + "에 해당하는 정보가 없습니다.");
        }

    }
}