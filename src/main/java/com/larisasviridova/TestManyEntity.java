package com.larisasviridova;

import javax.persistence.*;

@Entity
@Table(name = "TestMany", schema = "dbo", catalog = "Sample1")
public class TestManyEntity {
    private int code;
    private String fam;
    private int codetest;

    @Id
    @Column(name = "Code", nullable = false)
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Basic
    @Column(name = "CodeTest", nullable = false)
    public int getCodeTest() {
        return codetest;
    }

    public void setCodeTest(int codetest) {
        this.codetest = codetest;
    }

    @Basic
    @Column(name = "Fam", nullable = true, length = 50)
    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    @ManyToOne
    @JoinColumn(name = "CodeTest")
    private TestEntity testEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestManyEntity that = (TestManyEntity) o;

        if (code != that.code) return false;
        if (fam != null ? !fam.equals(that.fam) : that.fam != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (fam != null ? fam.hashCode() : 0);
        return result;
    }
}
