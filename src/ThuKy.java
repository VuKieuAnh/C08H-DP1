public class ThuKy {
    private String name;

    private ThuKy(String name) {
        this.name = name;
    }
    private static ThuKy thuKy;

    public static synchronized ThuKy getInstance(String name){
        if (thuKy == null){
            //tao moi
            thuKy = new ThuKy(name);
        }
        return thuKy;
    }

    @Override
    public String toString() {
        return "ThuKy{" +
                "name='" + name + '\'' +
                '}';
    }
}
