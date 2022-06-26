class Shop
{
	private String ID;
	private String name;
	private String address;
	private String contactNum;
	TrackingRecord[] trackingRecord = new TrackingRecord[0];


	Shop(String ID, String name, String address, String contactNum)
	{
		this.ID = ID;
		this.name = name;
		this.address = address;
		this.contactNum = contactNum;
	}
	public void setID(String ID)
	{
		this.ID = ID;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public void setContactNum(String contactNum)
	{
		this.contactNum = contactNum;
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getContactNum()
	{
		return contactNum;
	}
	public void display()
	{
		System.out.printf("===Shop Information===\n");
		System.out.printf("ID              : " + ID+"\n");
		System.out.printf("Name            : " + name+"\n");
		System.out.printf("Address         : " + address+"\n");
		System.out.printf("Contact Number  : " + contactNum+"\n");
	}
	public void addTrackingRecord(TrackingRecord record)
	{
		int size=trackingRecord.length;
		TrackingRecord[] newList= new TrackingRecord[size+1];
		for(int i=0;i<size;i++)
		{
			newList[i]=trackingRecord[i];
		}
		newList[size]=record;
		trackingRecord=newList;
	}
	public TrackingRecord[] getTrackingRecord()
	{
		return trackingRecord;
	}
}

