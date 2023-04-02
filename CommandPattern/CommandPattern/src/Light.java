public class Light {

    String Name;

    public Light(String Name){
        this.Name = Name;
    }


    public void on() {
        System.out.println(Name+"조명이 켜졌습니다.");
    }

    public void off(){
        System.out.println(Name+"조명이 꺼졌습니다.");
    }
    
}
