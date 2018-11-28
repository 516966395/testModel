package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Content;
import service.ContentService;

import java.util.Date;

@ContextConfiguration("classpath:spring/applicationContext-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class testContentService {

    @Autowired
    private ContentService contentService;

    @Test
    public void testSaveContent(){

        Content content = new Content("张三","男","不错不错！", new Date());

        contentService.saveContent(content);
    }
}
