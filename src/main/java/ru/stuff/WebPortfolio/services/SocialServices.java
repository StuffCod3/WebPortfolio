package ru.stuff.WebPortfolio.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.stuff.WebPortfolio.models.Social;
import ru.stuff.WebPortfolio.repositories.SocialRepositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialServices {
    private final SocialRepositories socialRepositories;

    public List<Social> showAllSocial(){
        return socialRepositories.findAll();
    }

    public Social showSocialById(int id){
        Optional<Social> findSocial = socialRepositories.findById(id);
        return findSocial.orElse(null);
    }

    public void saveSocial(Social social){
        socialRepositories.save(social);
    }


//    Social social1 = new Social(1, "j", 2);
//    Social social2 = new Social(2, "gfd", 56);
//    Social social3 = new Social(3, "hdfh", 142);
//
//    private List<Social> list = new ArrayList<>();
//
//
//    public List<Social> showAllSocial(){
//        list.add(social1);
//        list.add(social2);
//        list.add(social3);
//        return list;
//    }
//
//    public void saveSocial(Social social){
//        list.add(social);
//    }
//
//    public Social showSocialById(int id){
//
//        return list.get(id-1);
//    }
}
