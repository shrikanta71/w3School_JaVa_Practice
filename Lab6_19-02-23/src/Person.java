public class Person
{
    protected String name;
    protected int id;

    public Person(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void serId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getId()
    {
        return this.id;
    }
}
