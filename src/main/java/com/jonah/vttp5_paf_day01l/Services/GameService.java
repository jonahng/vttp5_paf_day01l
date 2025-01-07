package com.jonah.vttp5_paf_day01l.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonah.vttp5_paf_day01l.Models.Book;
import com.jonah.vttp5_paf_day01l.Models.Game;
import com.jonah.vttp5_paf_day01l.repositories.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepo;


    public List<Game> getGames(){
        return gameRepo.selectGames();
    }

    public List<Game> getGamesLimit(int limit){
        return gameRepo.getGamesLimit(limit);
    }

    public List<Book> getBooks(){
        return gameRepo.getBooks();
    }

    public List<Book> getBookSearch(String author, int limit){
        return gameRepo.getBookSearch(author, limit);
    }

    public Book getBookFromAsin(String asin){
        return gameRepo.getBookFromAsin(asin);
    }

    public void printAuthors(float rating){
        gameRepo.getAuthorRanking(rating);
    }
}
