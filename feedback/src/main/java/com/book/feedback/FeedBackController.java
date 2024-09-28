package com.book.feedback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeedBackController {

    @Autowired
    DataBaseManagement dbMgmnt;

    @GetMapping("/save-feedback")
    public String saveFeedBack(@RequestParam String yourname, @RequestParam String bookname, @RequestParam String feedback) throws Exception {
        System.out.println(yourname);
        dbMgmnt.saveFeedBackInDB(yourname, bookname, feedback);
        return "FeedBack saved successfully!!!";
    }


}
