interface Camera {
    void takePhoto();
}

class MobilePhone implements Camera {
    @Override
    public void takePhoto() {
        System.out.println("Clicking a photo!");
    }
}

public class Main {
    public static void main(String[] args) {
        MobilePhone p = new MobilePhone();
        p.takePhoto();
    }
}