package com.larisasviridova;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Test", schema = "dbo", catalog = "Sample1")
public class TestEntity {
    private int code;
    private String name;
    private String password;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Code", updatable = false, nullable = false)
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Password", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(mappedBy="testEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    //private Set<TestManyEntity> testManyEntities = new HashSet<TestManyEntity>();
    private Set<TestManyEntity> testManyEntities;
    //public Set<TestManyEntity> getTestManyEntities(){return testManyEntities;}

    public Set<TestManyEntity> getTestManyEntities() {
        return testManyEntities;
    }

    public void setTestManyEntities(Set<TestManyEntity> testManyEntities){this.testManyEntities=testManyEntities;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestEntity that = (TestEntity) o;

        if (code != that.code) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
