package main.model;

import main.entry.Board;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zhuo on 2016/11/7.
 */
public class BoardDao {
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * 返回第page页的maxNum个结果
     * @param page 从0开始
     * @param maxNum 默认是10
     * @return
     */
    public List<Board> getBoardsByPage(int page,int maxNum){
        Session sf = this.sessionFactory.getCurrentSession();
        Query query = sf.createQuery("from Board order by id desc ");
        query.setFirstResult(page*maxNum);
        query.setMaxResults(maxNum);
        return query.list();
    }

    public List<Board> getBoardsByPage(int page){
        return getBoardsByPage(page,10);
    }

    public List<Board> getAllBoards(){
        Session sf = this.sessionFactory.getCurrentSession();
        Query query = sf.createQuery("from Board order by id desc ");
        return query.list();
    }


    public void insertBoard(Board board){
        this.sessionFactory.getCurrentSession().save(board);
    }

    public void insertBoard(String name,String text){
        Board board =  new Board();
        board.setSubmitTime(new Timestamp(System.currentTimeMillis()));
        board.setMessage(text);
        board.setName(name);
        insertBoard(board);
    }
}
