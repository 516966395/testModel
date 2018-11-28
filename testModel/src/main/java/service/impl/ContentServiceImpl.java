package service.impl;

import mapper.ContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Content;
import service.ContentService;

import java.util.Date;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    public void saveContent(Content content) {
        content.setCreateTime(new Date());
        contentMapper.save(content);
    }
}
