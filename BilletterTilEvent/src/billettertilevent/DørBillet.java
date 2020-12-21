package billettertilevent;

public class DørBillet extends Billet {
    private int dørbillet = 150;

    public DørBillet(int id) {
        super(id);
        super.setPrice(dørbillet);
    }
}
