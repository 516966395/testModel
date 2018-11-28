package service;

import pojo.Content;

import java.util.List;

public interface ContentService {

    public void saveContent(Content content);

    public List<Content> findContentByUsername(String username);

    public void deleteContent(Integer id);

    public void updateContent(Content content);

    public List<Content> findContentList();

    public Content findOne(Integer id);
}
