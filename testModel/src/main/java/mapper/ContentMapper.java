package mapper;

import pojo.Content;

import java.util.List;

public interface ContentMapper {

    public void save(Content content);

    public List<Content> findContentByUsername(String username);

    public void delete(Integer id);

    public void update(Integer id, Content content);
}
