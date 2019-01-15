package com.larisasviridova;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.String;

@Service
public class UserService {
    @Autowired
    TestEntityRepository testEntityRepository;
    //@Query("select t from testEntity t left join t.testManyEntities tm")

    public List<TestEntity> getByName(String name) {
        return testEntityRepository.findByName(name);
    }
    public List<TestEntity> getByNameLike(String name) {return testEntityRepository.findByNameLike("%"+name+"%");}
    public TestEntity addTestEntity(TestEntity testEntity) {return testEntityRepository.saveAndFlush(testEntity);}
    void delete(TestEntity testEntity) {testEntityRepository.delete(testEntity);}
    void flush() {testEntityRepository.flush();}
    TestEntity getOne(Long code) {return testEntityRepository.getOne(code);} //проверяет существование объекта, если нет = null
    TestEntity findByCode(int code) {return testEntityRepository.findByCode(code);}

    @Autowired
    TestManyEntityRepository testManyEntityRepository;

}
