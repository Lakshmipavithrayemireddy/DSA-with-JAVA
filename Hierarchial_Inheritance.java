class Main {
    public static void main(String[] args) {
        System.out.println("Let's go for OOOOPPPPS");
        SrinivasuluSeeds branch1=new SrinivasuluSeeds("hyd",390,780);
        System.out.println(branch1.ownerName);
        branch1.display();
        
        SrinivasuluPesticides b1=new SrinivasuluPesticides("abhi",300,70);
        System.out.println(b1.ownerPhoneno);
        b1.display();
    }
}
class Owner{
    String ownerName="Srinivasulu Reddy";
    int ownerAge=35;
    int ownerPhoneno=1234566;
}
class SrinivasuluSeeds extends Owner
{
    String branchName;
    int seedsPacketsSold;
    int pricePerSeedsPacket;
    public SrinivasuluSeeds(String bn,int ss,int pps)
    {
        this.branchName=bn;
        this.seedsPacketsSold=ss;
        this.pricePerSeedsPacket=pps;
    }
    public void display()
    {
        System.out.println("Branch Name= "+branchName);
        System.out.println("seedsPacketsSold= "+seedsPacketsSold);
        System.out.println("pricePerSeedsPacket= "+pricePerSeedsPacket);
        System.out.println("Revenue Generated= "+(seedsPacketsSold*pricePerSeedsPacket));
        System.out.println();
    }
}

class SrinivasuluPesticides extends Owner
{
    String branchName;
    int PesticidesSold;
    int pricePerPesticide;
    public SrinivasuluPesticides(String bn,int ps,int ppp)
    {
        this.branchName=bn;
        this.PesticidesSold=ps;
        this.pricePerPesticide=ppp;
    }
    public void display()
    {
        System.out.println("Branch Name= "+branchName);
        System.out.println("PesticidesSold= "+PesticidesSold);
        System.out.println("pricePerSeedsPacket= "+pricePerPesticide);
        System.out.println("Revenue Generated= "+(PesticidesSold*pricePerPesticide));
        System.out.println();
    }
}
