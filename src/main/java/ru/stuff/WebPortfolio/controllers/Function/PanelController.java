package ru.stuff.WebPortfolio.controllers.Function;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.stuff.WebPortfolio.models.Social;
import ru.stuff.WebPortfolio.services.SocialServices;

@Controller
@RequiredArgsConstructor
public class PanelController {
    private final SocialServices socialServices;
    @PostMapping("/panel/social/add")
    public String createSocial(@ModelAttribute("socials") @Valid Social socials, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "panel/panel";
        }else {
            socialServices.saveSocial(socials);
            return "redirect:/projects";
        }
    }
}
