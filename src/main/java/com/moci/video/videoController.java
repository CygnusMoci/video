package com.moci.video;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author moci
 * @create 2019-03-10 10:29
 **/
@Controller
public class videoController {
    @GetMapping("/video")
    public String video(){
        return "/video";
    }

    @GetMapping("/video2")
    public String video2(){
        return "/video2";
    }
}
