package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 이래야 component scan을 해서 컨테이너에 빈으로 등록됨.
public class HelloController {
    @GetMapping("hello") // get /hello
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!"); // "data가 key, hello가 value"
        return "hello"; // ../resources/templates.hello.html로 매핑
    }
}
