package lesson6;

public class Animal {
    /**
     * 4  подсчет живности
     */
    public static int count = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        count++;
        System.out.println("живность №" + count);
    }
    /**
     * 2 вся живность бежит плывет а в качестве параметра методу передаем длинну препятствия
     *
     */
    protected void run(int range){
        validateRange(range);
        System.out.println(name+"пробежал"+ range +"m");
    }
    protected void swim(int range) {
        validateRange(range);
        System.out.println(name + "проплыл" + range + "m");
        /**
         * 3 ограничения на дуатлон бег плавание
         * @parm range
         *
         */
        protected void validateRange ( int range){
            if (range < 0) {
                throw new IllegalArgumentException("расстояние не может быть в минусу");

            }
        }
        protected void validateRun( int range){
        }
        protected void validateSwim( int range){

        }
    }