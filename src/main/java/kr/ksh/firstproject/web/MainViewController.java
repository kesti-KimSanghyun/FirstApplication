package kr.ksh.firstproject.web;

import java.util.concurrent.atomic.AtomicLong;

import kr.ksh.firstproject.repository.BoardList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainViewController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/boardlist")
    public BoardList BoardList(@RequestParam(value="name", defaultValue="World") String name) {
        return new BoardList(counter.incrementAndGet(),
                            String.format(template, name), name, null);
    }
}
