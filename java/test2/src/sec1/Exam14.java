package sec1;

public class Exam14 {
}

interface DataAccessObject {
    public void select();
    public void insert();
    public void update();
    public void delete();
}

class OracleDao implements DataAccessObject {
    @Override
    public void select() {
        System.out.println("Oracle DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("Oracle DB에서 검색");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}

class MySqlDao implements DataAccessObject {
    @Override
    public void select() {
        
    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
