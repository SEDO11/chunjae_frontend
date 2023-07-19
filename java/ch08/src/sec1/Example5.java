package sec1;

public class Example5 {
    static class Animal {
        private String name;
        private int age;
        private String gender;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class Tiger extends Animal {
        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setName(String name) {
            super.setName(name);
        }
    }
    static class Lion extends Animal {
        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setName(String name) {
            super.setName(name);
        }
    }

    public static void main(String[] args) {
        Animal ani;
        ani = new Tiger();
        ani = new Lion();

        ani.setName("동물1");
        System.out.println(ani.getName());

        Tiger t = new Tiger();
        changeObject1(t);
        changeObject2(t);

        t.setName("호랑이1");
        System.out.println(t.getName());
        
        Lion l = new Lion();
        changeObject1(l);
        changeObject2(l);
        
        l.setName("사자1");
        System.out.println(l.getName());
    }
    
    // 예외처리를 별도의 메소드에서 처리
    public static void changeObject1(Animal ani) {
        try{
            Lion l = (Lion) ani;
            System.out.println("Lion 형변환 완료");
        } catch (ClassCastException e) {
            System.out.println("형제나 다른 패키지에 있는 클래스의 객체로 형변환 불가");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void changeObject2(Animal ani) {
        try{
            Tiger l = (Tiger) ani;
            System.out.println("Tiger 형변환 완료");
        } catch (ClassCastException e) {
            System.out.println("형제나 다른 패키지에 있는 클래스의 객체로 형변환 불가");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
