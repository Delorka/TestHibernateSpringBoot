package com.larisasviridova;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestEntityRepository extends JpaRepository<TestEntity,Long> {
    List<TestEntity> findByName(String name);
    List<TestEntity> findByNameLike(String name);
    TestEntity saveAndFlush(TestEntity testEntity);
    void delete(TestEntity testEntity);
    TestEntity findByCode(int code);
}
