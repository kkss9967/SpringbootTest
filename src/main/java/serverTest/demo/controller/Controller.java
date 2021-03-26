package serverTest.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import serverTest.demo.dto.InfoDTO;
import serverTest.demo.service.InfoService;

@RequiredArgsConstructor    // 생성자 대신 만들어줌
@RestController // 컨트롤러 지정
@RequestMapping("/bootTest")        // 컨트롤러 태그 지정
public class Controller {
    private final InfoService service;

    @GetMapping("/info")       // 세부 이정표
    public ResponseEntity<InfoDTO> getCharaInfo(@RequestParam(name="id") int id) throws Exception {
        System.out.println("요청 들어옴!"+id);
        return this.service.getInfo(id);
    }
}