package com.training.spring.repositories.base;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDao<Entity, ID extends Serializable> {

    Entity findById(ID id);

    List findAll();

    List search(Map<String, Object> parameterMap);

    ID insert(Entity entity);

    void update(Entity entity);

    void delete(Entity entity);

    void deleteById(ID id);

}
