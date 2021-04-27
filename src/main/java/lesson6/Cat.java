package lesson6;

public class Cat extends Animal{
    public static int count1 = 0;

    public Cat(String name) {
        super(name);
        count1++;
        System.out.println("кот №" + count1);
    }
    @Override
    protected  void run(int range){
        super.validateRange(range);
        validateRun(range);
        super.run(range);
    }
    @Override
    protected void swim(int range){System.out.println("кот не умеет плавать");}

    @Override
    protected void validateRange(int range){
        super.validateRange(range);
        if(range >200){
            throw new IllegalArgumentException("кот не может пробежать более чем 200")
        }
    }
}
