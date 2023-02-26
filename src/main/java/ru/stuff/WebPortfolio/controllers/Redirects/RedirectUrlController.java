package ru.stuff.WebPortfolio.controllers.Redirects;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class RedirectUrlController {

    //Социальные сети
    @GetMapping("/vk")
    public String redirectVk(){
        return "redirect/vk";
    }

    @GetMapping("/group")
    public String redirectGroupVk(){
        return "redirect/vkGroup";
    }

    @GetMapping("/telegram")
    public String redirectTelegram(){
        return "redirect/telegram";
    }

    @GetMapping("/twitch")
    public String redirectTwitch(){
        return "redirect/twitch";
    }

    @GetMapping("/boosty")
    public String redirectBoosty(){
        return "redirect/boosty";
    }

    @GetMapping("/kwork")
    public String redirectKwork(){
        return "redirect/kwork";
    }


}
