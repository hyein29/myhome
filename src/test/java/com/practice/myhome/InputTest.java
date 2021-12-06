package com.practice.myhome;

import com.practice.myhome.model.Board;
import com.practice.myhome.model.User;
import com.practice.myhome.repository.BoardRepository;
import com.practice.myhome.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InputTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertTest(){

        for(int i=0; i<100; i++){
            User user = new User();
            user.setUsername("testuser"+i);
            user.setPassword("testpw"+i);
            user.setEnabled(true);
            userRepository.save(user);
        }
    }

    @Test
    public void insertBoardTest(){

        for(int i=0; i<100; i++){
            Board board = new Board();
            board.setTitle("title"+i);
            board.setContent("content"+i);

            boardRepository.save(board);
        }
    }


}
