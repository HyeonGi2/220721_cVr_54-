package com.sbs.exam.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.exam.day1.repository.ArticleRepository;
import com.sbs.exam.day1.vo.Article;

@Service
public class ArticleService {
	private ArticleRepository articleRepository;
	// autowired 지우고 생성자 주입
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	

	
	public int writeArticle(String title, String body) {
		articleRepository.writeArticle(title, body);
		return articleRepository.getLastInsertId();
	}
	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}
	public Article getArticle(int id) {
		return articleRepository.getArticle(id);
	}
	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);
	}
	public void modifyArticle(int id, String title, String body) {
		articleRepository.modifyArticle(id, title, body);
	}

}
