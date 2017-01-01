package main.controller;

import main.entry.Board;
import main.model.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;

/**
 * Created by zhuo on 2016/11/7.
 */
@Controller
@RequestMapping("/textSubmit")
public class TextSubmitController {
    @Autowired
    BoardDao boardDao;

    public void setBoardDao(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String  submitJumpHandel(){
        return "submit";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String  textHandel(@RequestParam String text,@RequestParam String name){
        boardDao.insertBoard(name,text);
        return "redirect:/hello?page=0";
    }
}
