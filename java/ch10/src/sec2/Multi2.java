package sec2;

public class Multi2<T, M> {
    private T name;
    private M age;

    public Multi2() { } // no argument
    public Multi2(T name, M age) { // all argument
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }
    
    //제너릭 메소드
    // 두 객체를 이용해 이름과 나이를 입력받아서 서로 같은지 비교
    public static<T, V> boolean conpare(Multi2<T, V> m1, Multi2<T, V> m2) { // 매개변수를 참조타입으로 받고 출력을 boolean 타입으로
        boolean nameCompare = m1.getName().equals(m2.getName());
        boolean ageCompare = m1.getAge().equals(m2.getAge());
        return nameCompare && ageCompare;
    }
}
