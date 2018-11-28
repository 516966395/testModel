package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Content;
import service.ContentService;

@RestController
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/save")
    public String save(Content content){//    public String save(@RequestBody Content content){

        try{
            contentService.saveContent(content);
        }catch(Exception e){
            e.printStackTrace();
            return "创建失败";
        }

        return "创建成功";
    }


}
