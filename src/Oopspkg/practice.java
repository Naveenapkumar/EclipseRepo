package Oopspkg;

interface TVRemote {
    void increaseVolume();
    void decreaseVolume();
}

interface SmartTVRemote extends TVRemote {
    void connectToInternet();
}

class TV implements SmartTVRemote {


    @Override
    public void increaseVolume() {
        System.out.println("Volume increased");
    }

    @Override
    public void decreaseVolume() {
       
        System.out.println("Volume decreased to ");
    }
    
    @Override
	public void connectToInternet() {
        System.out.println("Connected to internet");

	}

public static void main(String[] args) {
        TV obj = new TV();
        obj.increaseVolume();
        obj.decreaseVolume();
        obj.connectToInternet();
    }

	

}





