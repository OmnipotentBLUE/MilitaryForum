package cn.zzy.forum.service;

import cn.zzy.forum.entity.MyCollection;

import java.util.List;

public interface MyCollectionService {
    List<MyCollection> findAll(int user_id);

    MyCollection findCollection(int user_id, int discussion_id);

    int addCollection(MyCollection myCollection);

    int cancelCollection(MyCollection myCollection);

    List<MyCollection> findCollectionUsers(int discussion_id);
}
