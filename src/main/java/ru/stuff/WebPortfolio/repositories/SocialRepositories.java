package ru.stuff.WebPortfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.stuff.WebPortfolio.models.Social;

@Repository
public interface SocialRepositories extends JpaRepository<Social, Integer> {
}
