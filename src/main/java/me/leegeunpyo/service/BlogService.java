package me.leegeunpyo.service;

import lombok.RequiredArgsConstructor;
import me.leegeunpyo.domain.Article;
import me.leegeunpyo.dto.AddArticleRequest;
import me.leegeunpyo.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
