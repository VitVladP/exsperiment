package old.equalsAnDhash;

public class TestTEst {
    String name;
    String surName;
    String sex;
    int age;
    int id;
    TestEquals testMe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestTEst testTEst = (TestTEst) o;

        if (age != testTEst.age) return false;
        if (name != null ? !name.equals(testTEst.name) : testTEst.name != null) return false;
        if (surName != null ? !surName.equals(testTEst.surName) : testTEst.surName != null) return false;
        if (sex != null ? !sex.equals(testTEst.sex) : testTEst.sex != null) return false;
        return testMe != null ? testMe.equals(testTEst.testMe) : testTEst.testMe == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (testMe != null ? testMe.hashCode() : 0);
        return result;
    }
}
