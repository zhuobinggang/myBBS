package main.test;
import main.entry.Board;
import main.model.BoardDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhuo on 2016/11/7.
 */
public class testBoardDao {
    @Test
    public void testInsertBoard(){
        //Test OK
//        Board []boards = new Board[20];
//        ApplicationContext ac = new ClassPathXmlApplicationContext("foo.xml");
//        BoardDao bd = ac.getBean("boardDao",BoardDao.class);
//
//        for(int i=0;i<20;i++){
//            boards[i] = new Board();
//            Board board = boards[i];
//            board.setName("名字："+i);
//            board.setMessage("text："+i);
//            board.setSubmitTime(new Timestamp(System.currentTimeMillis()));
//
//            bd.insertBoard(board);
//        }
    }

    @Test
    public void testGetBoards(){
        //test OK
        ApplicationContext ac = new ClassPathXmlApplicationContext("foo.xml");
        BoardDao bd = ac.getBean("boardDao",BoardDao.class);
//
//        List<Board> boards = bd.getBoardsByPage(0);
//        for(Board board:boards){
//            System.out.println(board.toString());
//        }
    }
}
