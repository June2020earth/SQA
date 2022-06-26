public abstract class Person {
    private String name;
    private String contactNum;
    private String password;

    Person(String name,String contactNum,String password)
    {
       this.name=name;
       this.contactNum=contactNum;
       this.password=password;
    }
    public String getName()
    {
        return this.name;
    }
    public String getContactNum()
    {
        return this.contactNum;
    }
    public String getPassword()
    {
        return this.password;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setContactNum(String contactNum)
    {
        this.contactNum=contactNum;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public abstract void display();

}
