package main.controller;

import main.entry.Board;
import main.model.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zhuo on 2016/11/6.
 */
@Controller
@RequestMapping(value = "/hello")
public class IndexController {
    @Autowired
    BoardDao boardDao;

    public void setBoardDao(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView defaultRequestHandel(@RequestParam(defaultValue = "0") int page){
        ModelAndView mav = new ModelAndView("homepage");
        List<Board> boards = boardDao.getBoardsByPage(page);
        mav.addObject("boards",boards);
        mav.addObject("page",page);
        return mav;
    }
}
