public class Animal{

    //物件的屬性
    String name;
    String gender;
    int rare;

    //建構子
    public Animal(String name, String gender, int rare){
        this.name = name;
        this.gender = gender;
        this.rare = rare;
    }

    //物件的方法
    public void animalName(){
        System.out.print(this.name+" ");
    }
    public void animalGender(){
        System.out.print(this.gender+" ");
    }
    public int animalRare(int x) {
        // System.out.println(this.rare+" ");
        return rare;
    }
    
    //主程式
    public static void main(String[] argv){
        Animal ref = new Animal("Nancy", "female", 5);
        ref.animalName();
        ref.animalGender();
        System.out.print(ref.rare);
        if(ref.animalRare(3) < 10) {
            System.out.println(" 還有很多");
        } else if(ref.animalRare(3) > 100) {
            System.out.println(" 瀕臨絕種QQ");
        } else {
            System.out.println(" 保育類");
        }

        ref = new Animal("George", "male", 50);
        ref.animalName();
        ref.animalGender();
        System.out.print(ref.rare);
        if(ref.animalRare(3) < 10) {
            System.out.println(" 還有很多");
        } else if(ref.animalRare(3) > 100) {
            System.out.println(" 瀕臨絕種QQ");
        } else {
            System.out.println(" 保育類");
        }

        ref = new Animal("Sam", "male", 101);
        ref.animalName();
        ref.animalGender();
        System.out.print(ref.rare);
        if(ref.animalRare(3) < 10) {
            System.out.println(" 還有很多");
        } else if(ref.animalRare(3) > 100) {
            System.out.println(" 瀕臨絕種QQ");
        } else {
            System.out.println(" 保育類");
        }
    }
}
