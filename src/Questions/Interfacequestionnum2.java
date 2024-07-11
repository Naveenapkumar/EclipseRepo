package Questions;


interface Tvremote {
    public void increaseVolume();
    public void decreaseVolume();
}

interface Smartvremote extends Tvremote {
    public void connectToInternet();
}

class TV implements Smartvremote {

    @Override
    public void increaseVolume() {
        System.out.println("Volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume decreased");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Connected to internet");
    }
}

public class Interfacequestionnum2 {

    public static void main(String[] args) {
        TV obj = new TV();
        obj.increaseVolume();
        obj.decreaseVolume();
        obj.connectToInternet();
    }
}
