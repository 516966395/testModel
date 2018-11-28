package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Content;
import service.ContentService;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/save")
    public String save(@RequestBody Content content){//    public String save(@RequestBody Content content){

        try{
            contentService.saveContent(content);
        }catch(Exception e){
            e.printStackTrace();
            return "提交失败";
        }

        return "提交成功";
    }

    @RequestMapping
    public List<Content> searchList(){

        List<Content> list = contentService.findContentList();

        return list;
    }

    @RequestMapping("/findOne")
    public Content searchList(Integer id){

        Content content = contentService.findOne(id);

        return content;
    }

    @RequestMapping("/delete")
    public void deleteContent(Integer id){

        contentService.deleteContent(id);

    }
}
