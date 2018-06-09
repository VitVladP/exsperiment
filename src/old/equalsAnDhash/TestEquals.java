package old.equalsAnDhash;

public class TestEquals {
    private static int param = 0;
    private int id;
    private String name;
    private int salary;

    public TestEquals (final String name, final int salary){
        this.name = name;
        this.salary = salary;
        id = param++;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true; //links
        if(obj == null || getClass()!=obj.getClass()) return false;
        TestEquals testEq = (TestEquals) obj;

        if (salary != testEq.salary) return false;
        return  name!=null? name.equals(testEq.name) : testEq.name == null;

    }

    @Override
    public int hashCode(){
        int result = salary;
        result = 31 * result + (name != null? name.hashCode() : 0 );
        return  result;
    }

    @Override
    public String toString(){
        String str = " name : " + name + " ** salary : "+ salary;
        return str;
    }

}
