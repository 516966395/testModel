package service.impl;

import mapper.ContentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Content;
import service.ContentService;

import java.util.Date;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    public void saveContent(Content content) {

        content.setCreateTime(new Date());

        if(content.getId() != null){

            contentMapper.update(content);
        }else{

            contentMapper.save(content);
        }

    }

    public List<Content> findContentByUsername(String username) {
        return contentMapper.findContentByUsername(username);
    }

    public void deleteContent(Integer id) {
        contentMapper.delete(id);
    }

    public void updateContent(Content content) {
        contentMapper.update(content);
    }

    public List<Content> findContentList() {
        return contentMapper.findContentList();
    }

    public Content findOne(Integer id) {
        return contentMapper.findOne(id);
    }
}
