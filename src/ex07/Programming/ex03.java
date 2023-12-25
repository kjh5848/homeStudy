package ex07.Programming;

class Sports {
    String getName() {
        return "아직 결정되지 않음";
    }

    int getPlauers() {
        return 0;
    }

}

class Soccer extends Sports {

    @Override
    String getName() {
        return "경기이름: 축구";
    }

    @Override
    int getPlauers() {
        return 11;
    }
}

public class ex03 {
    public static void main(String[] args) {
        Sports s = new Soccer();

        System.out.println(s.getName());
        System.out.println("경기자수: "+ s.getPlauers());
    }

}
