package ru.stuff.WebPortfolio.controllers.Redirects;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.stuff.WebPortfolio.models.Social;
import ru.stuff.WebPortfolio.services.SocialServices;

@Controller
@RequiredArgsConstructor
public class RedirectPageControllers {

    private final SocialServices socialServices;

    @GetMapping("/")
    public String redirectMainPage(){
        return "main/main";
    }

    @GetMapping("/contacts")
    public String redirectContactsPage(){
        return "contact/contact";
    }

    @GetMapping("/projects")
    public String redirectProjectsPage(){
        return "projects/projects";
    }

    @GetMapping("/panel")
    public String redirectPanelPage(){
        return "panel/panel";
    }

    //Лист соцсетей
    @GetMapping("/panel/social")
    public String redirectPanelSocialPage(Model model){
        model.addAttribute("socials", socialServices.showAllSocial());
        return "panel/social";
    }

    @GetMapping("/panel/social/add")
    public String redirectPanelSocialAddPage(Model model){
        model.addAttribute("socials", new Social());
        return "panel/social_add";
    }

    @GetMapping("/panel/project")
    public String redirectPanelProjectPage(){
        return "panel/project";
    }
}
