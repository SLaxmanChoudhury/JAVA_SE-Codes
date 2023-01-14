class Memory
{
    String memoryType;
    String memoryBrand;
    public Memory(String memoryType, String memoryBrand)
    {
        this.memoryType = memoryType; //HDD or SSD
        this.memoryBrand = memoryBrand; // intel or Sandisk
    }

}
class Mobile
{
    Memory memory;
    String mobileBrand;
    String mobileColor;

    public Mobile(String mobileBrand, String mobleColor){
        this.mobileBrand = mobileBrand;
        this.mobileColor = mobileColor;
    }

    public void setMemory(Memory memory){
        this.memory = memory;
    }

    public void disPlay(){
        System.out.println("Mobile Details are : ");
        System.out.println(mobileBrand + ", " + mobileColor);
        System.out.println("===============================");
        System.out.println("Memory Details are : ");
        System.out.println(memory.memoryType + ", " + memory.memoryBrand);
    }


    // void setmobileBrand(String mobileBrand)
    // {
    //     this.mobileBrand = mobileBrand;
    // }
    // String getmobileBrand()
    // {
    //     return mobileBrand;
    // }
    // void setmobileColour(String mobileColour)
    // {
    //     this.mobileColour = mobileColour;
    // }
    // String getmobileColour()
    // {
    //     return mobileColour;
    // }




    // void setmemoryType(String memory.memoryType)
    // {
    //     this.memory.memoryType = memory.memoryType;
    // }
    // String getmemoryType()
    // {
    //     return memoryType;
    // }
    // void setmemoryBrand(String memory.memoryBrand)
    // {
    //     this.memory.memoryBrand = memory.memoryBrand;
    // }
    // String getmemoryBrand()
    // {
    //     return memory.memoryBrand;
    // }
    



}




class One_One_Gerrer
{
    public static void main(String[] args)
    {

        Memory memory = new Memory("HDD", "Intel");


        Mobile mobile = new Mobile("Poco", "Blue");
        mobile.setMemory(memory);
        mobile.disPlay();


        // Memory memory = new Memory("HDD","Intel");
        // memory.getmemoryBrand();
        // memory.getmemoryType();
        // Mobile mobile = new Mobile();
        // mobile.setmobileBrand("POCO");
        // mobile.setmobileColour("Blue");
        // mobile.getmemoryBrand();
        // mobile.getmobileColour();


    }
}
